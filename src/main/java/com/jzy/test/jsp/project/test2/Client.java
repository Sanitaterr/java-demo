package com.jzy.test.jsp.project.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        String str = "nice to meet you";
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(str.getBytes());

        // 结束标志
        socket.shutdownOutput();

        // 接收服务端回写的数据
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

        int b;
        while ((b = inputStreamReader.read()) != -1) {
            System.out.print((char)b);
        }

        socket.close();
    }
}
