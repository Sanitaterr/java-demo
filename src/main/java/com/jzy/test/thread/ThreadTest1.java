package com.jzy.test.thread;

/**
 * @author jzy
 */
public class ThreadTest1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread() + ": " + "Hello World");
        }
    }
}
