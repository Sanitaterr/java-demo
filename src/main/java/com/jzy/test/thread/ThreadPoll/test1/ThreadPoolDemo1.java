package com.jzy.test.thread.ThreadPoll.test1;

public class ThreadPoolDemo1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
