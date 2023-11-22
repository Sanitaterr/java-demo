package com.jzy.test.jsp.test1_UDP.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class SendMessageDemo2 {
    public static void main(String[] args) throws IOException {
        // 组播
        MulticastSocket multicastSocket = new MulticastSocket();

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("清发言：");
            String str = in.nextLine();
            if ("exit".equals(str)) {
                break;
            }
            byte[] strBytes = str.getBytes();
            InetAddress address = InetAddress.getByName("224.0.0.1");
            int port = 10000;
            DatagramPacket datagramPacket = new DatagramPacket(strBytes, strBytes.length, address, port);

            multicastSocket.send(datagramPacket);
        }

        multicastSocket.close();
    }
}
