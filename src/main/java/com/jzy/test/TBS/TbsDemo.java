package com.jzy.test.TBS;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author tbs
 */
public class TbsDemo {

    // 唯一且永久
    public static void main(String[] args) throws Throwable {
        MyTimer timer = new MyTimer() {

            @Override
            void end(Void result) {
                System.out.println("i am wake " + System.currentTimeMillis());
            }

            @Override
            Void onError(Throwable throwable) {
                System.out.println("on error:" + throwable.getMessage());
                return null;
            }

        };
        timer.excute(5);
        Thread.sleep(10000);
        System.out.println("end");
    }
}

abstract class MyThread<T, P> {

    abstract void pre(P param) throws Throwable;

    abstract T work(P param) throws Throwable;

    abstract void end(T result);

    abstract T onError(Throwable throwable);

    void excute(P param) throws Throwable {
        T res = null;
        pre(param);
        FutureTask<T> thread = new FutureTask<>(new Callable<T>() {

            @Override
            public T call() throws Exception {
                T v = null;
                try {
                    v = work(param);
                } catch (Throwable throwable) {
                    v = onError(throwable);
                }

                return v;
            }
        });
        thread.run();
        res = (T) thread.get();
        end(res);
    }
}

/**
 * MyTimer
 */
abstract class MyTimer extends MyThread<Void, Integer> {

    @Override
    void pre(Integer param) throws Throwable {
        if (param == null || param <= 0) {
            throw new UnsupportedOperationException("等待时间不可为空或小于0");
        }
        System.out.println("wait for " + param + "s,now is " + System.currentTimeMillis());
    }

    @Override
    Void work(Integer param) throws Throwable {
        Thread.sleep(param * 1000);
        return null;
    }

}