package com.jzy.test.jsp.test2_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author l
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // TCP协议，接收数据

        // 1.创建对象ServerSocket
        ServerSocket serverSocket = new ServerSocket(10000);

        // 2.监听客服端的连接
        // 等待客户端连接
        Socket socket = serverSocket.accept();

        // 3.从连接通道中获取输入流读取数据
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int b;
        while ((b = bufferedReader.read()) != -1) {
            System.out.print((char)b);
        }

        // 4.释放资源
        socket.close();
        serverSocket.close();
    }
}
