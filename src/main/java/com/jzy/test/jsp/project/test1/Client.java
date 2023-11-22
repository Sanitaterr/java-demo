package com.jzy.test.jsp.project.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author l
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        Scanner in = new Scanner(System.in);
        OutputStream outputStream = socket.getOutputStream();
        while (true) {
            System.out.print("请输入您要发送的信息：");
            String str = in.nextLine();
            if ("exit".equals(str)) {
                break;
            }
            outputStream.write(str.getBytes());
        }

        socket.close();
    }
}
