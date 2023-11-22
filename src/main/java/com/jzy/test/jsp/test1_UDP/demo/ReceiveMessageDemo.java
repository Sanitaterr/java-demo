package com.jzy.test.jsp.test1_UDP.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        // 接受数据

        // 1.也是先创建DatagramSocket对象
        // 在接收的时候一定要绑定端口，且一定要和发送的端口保持一致
        DatagramSocket datagramSocket = new DatagramSocket(10086); // 需要和发送端一致

        // 2.接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        while (true) {
            // receive方法是阻塞的，程序执行到这一步会等待，等发送端发送消息
            datagramSocket.receive(datagramPacket);

            // 3.解析数据包
            byte[] data = datagramPacket.getData();
            int length = datagramPacket.getLength();
            InetAddress address = datagramPacket.getAddress();
            int port = datagramPacket.getPort();
            System.out.println("接收到数据：" + new String(data, 0, length));
            System.out.println("该数据是从" + address +  "这台电脑中的" + port + "这个端口中发出的");
        }

        // 4.释放资源
        // datagramSocket.close();
    }
}
