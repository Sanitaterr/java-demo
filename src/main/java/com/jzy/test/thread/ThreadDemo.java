package com.jzy.test.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author jzy
 */
public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ThreadTest1 threadTest1 = new ThreadTest1();
////
////        Thread t1 = new Thread(threadTest1);
////        Thread t2 = new Thread(threadTest1);
////
////        t1.setName("No.1");
////        t2.setName("No.2");
////
////        t1.start();
////        t2.start();

//        ThreadTest2 threadTest2 = new ThreadTest2();
//        FutureTask<Integer> futureTask = new FutureTask<>(threadTest2);
//        Thread t1 = new Thread(futureTask);
//
//        t1.start();
//        Integer res = futureTask.get();
//        System.out.println(res);

//        ThreadTest3 t1 = new ThreadTest3();
//        ThreadTest3 t2 = new ThreadTest3();
//        ThreadTest3 t3 = new ThreadTest3();
//
//        t1.setName("窗口1");
//        t2.setName("窗口2");
//        t3.setName("窗口3");
//
//        t1.start();
//        t2.start();
//        t3.start();

//        ThreadTest5 threadTest5 = new ThreadTest5();
//        Thread t1 = new Thread(threadTest5);
//        Thread t2 = new Thread(threadTest5);
//        Thread t3 = new Thread(threadTest5);
//
//        t1.setName("窗口1");
//        t2.setName("窗口2");
//        t3.setName("窗口3");
//
//        t1.start();
//        t2.start();
//        t3.start();

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
        // 创建多线程要运行的参数对象
        ThreadTest6 threadTest6 = new ThreadTest6(list);
        // 创建管理者对象
        FutureTask<Integer> futureTask1 = new FutureTask<>(threadTest6);
        FutureTask<Integer> futureTask2 = new FutureTask<>(threadTest6);

        Thread t1 = new Thread(futureTask1);
        Thread t2 = new Thread(futureTask2);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer max1 = futureTask1.get();
        Integer max2 = futureTask2.get();

        System.out.println(max1);
        System.out.println(max2);
    }
}
