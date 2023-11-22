package com.jzy.test.thread;

import java.util.concurrent.Callable;

/**
 * 可以获取到线程最后的结果
 * @author l
 */
public class ThreadTest2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
