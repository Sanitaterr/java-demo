package com.jzy.test.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author l
 */
public class ThreadTest5 implements Runnable {
    int ticket = 0;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket == 100) {
                break;
            } else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket ++ ;
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票!!!");
            }
            lock.unlock();
        }
    }
}
