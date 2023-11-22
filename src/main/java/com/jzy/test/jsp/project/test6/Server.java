package com.jzy.test.jsp.project.test6;

import com.jzy.test.jsp.project.test5.MyRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 线程池优化
 * @author jzy
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(), // 线程工厂，让线程池如何创建线程对象
                new ThreadPoolExecutor.AbortPolicy() // 任务拒绝策略
        );

        ServerSocket serverSocket = new ServerSocket(10000);

        while (true) {
            Socket socket = serverSocket.accept();

            // 开启一条线程
            // 只要有用户来连了，就对应服务端一条线程
            // new Thread(new MyRunnable(socket)).start();
            threadPoolExecutor.submit(new MyRunnable(socket));
        }
    }
}
