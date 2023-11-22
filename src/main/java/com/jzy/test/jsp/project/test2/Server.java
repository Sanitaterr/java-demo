package com.jzy.test.jsp.project.test2;

import org.apache.tomcat.jni.OS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        Socket socket = serverSocket.accept();

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

        // read方法会从连接通道中读取数据
        // 但是，需要有一个结束标记，此处循环才会停止
        // 否则，程序就会一直停在read方法这里，等待读取下面的数据
        int b;
        while ((b = inputStreamReader.read()) != -1) {
            System.out.print((char)b);
        }

        // 回写数据
        String str = "nice to meet you too";
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(str.getBytes());

        socket.close();
        serverSocket.close();
    }
}
