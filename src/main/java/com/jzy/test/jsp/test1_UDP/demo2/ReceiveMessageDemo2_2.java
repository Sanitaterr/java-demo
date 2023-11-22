package com.jzy.test.jsp.test1_UDP.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo2_2 {
    public static void main(String[] args) throws IOException {
        MulticastSocket multicastSocket = new MulticastSocket(10000);

        // 将当前本机，添加到224.0.0.1当中
        InetAddress addr = InetAddress.getByName("224.0.0.2");
        multicastSocket.joinGroup(addr);

        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        while (true) {
            multicastSocket.receive(datagramPacket);

            byte[] data = datagramPacket.getData();
            int length = datagramPacket.getLength();
            InetAddress address = datagramPacket.getAddress();
            int port = datagramPacket.getPort();
            System.out.println("接收到数据：" + new String(data, 0, length));
            System.out.println("该数据是从" + address +  "这台电脑中的" + port + "这个端口中发出的");
        }

        // multicastSocket.close();
    }
}
