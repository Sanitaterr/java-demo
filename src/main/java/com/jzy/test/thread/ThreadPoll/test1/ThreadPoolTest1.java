package com.jzy.test.thread.ThreadPoll.test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author l
 */
public class ThreadPoolTest1 {
    public static void main(String[] args) throws InterruptedException {
        // 获取线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();

        // 提交任务
        pool1.submit(new ThreadPoolDemo1());
        pool1.submit(new ThreadPoolDemo1());
        pool1.submit(new ThreadPoolDemo1());
        Thread.sleep(1000);
        pool1.submit(new ThreadPoolDemo1());
        Thread.sleep(1000);
        pool1.submit(new ThreadPoolDemo1());

        // pool1.shutdown();
    }
}
