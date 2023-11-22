package com.jzy.test.thread;

/**
 * @author l
 */
public class ThreadTest3 extends Thread {
    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (ThreadTest3.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket ++ ;
                    System.out.println(getName() + "正在卖第" + ticket + "张票!!!");
                } else {
                    break;
                }
            }
        }
    }
}
