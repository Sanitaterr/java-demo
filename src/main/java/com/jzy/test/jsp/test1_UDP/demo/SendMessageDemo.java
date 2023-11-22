package com.jzy.test.jsp.test1_UDP.demo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        // 发送数据

        // 1.创建DatagramSocket对象
        // 空参：则在可用端口中随机进行一个使用
        // 有参：指定端口号进行绑定
        DatagramSocket datagramSocket = new DatagramSocket();

        // 2.打包数据
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("清发言：");
            String str = in.nextLine();
            if ("exit".equals(str)) {
                break;
            }
            byte[] strBytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1"); // 广播的话改为255.255.255.255
            int port = 10086; // 需要和接收端一致
            DatagramPacket datagramPacket = new DatagramPacket(strBytes, strBytes.length, address, port);

            // 3.发送数据
            datagramSocket.send(datagramPacket);
        }

        // 4.释放资源
        datagramSocket.close();
    }
}
