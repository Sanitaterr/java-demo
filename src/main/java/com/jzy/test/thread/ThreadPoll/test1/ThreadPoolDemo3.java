package com.jzy.test.thread.ThreadPoll.test1;

/**
 * @author jzy
 */
public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
