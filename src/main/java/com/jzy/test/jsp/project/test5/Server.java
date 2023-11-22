package com.jzy.test.jsp.project.test5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * 多线程优化
 * @author jzy
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        while (true) {
            Socket socket = serverSocket.accept();

            // 开启一条线程
            // 只要有用户来连了，就对应服务端一条线程
            new Thread(new MyRunnable(socket)).start();
        }
    }
}
