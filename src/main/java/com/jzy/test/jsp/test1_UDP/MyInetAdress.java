package com.jzy.test.jsp.test1_UDP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAdress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("lenovoy");
        System.out.println(address);

        String name = address.getHostName();
        System.out.println(name);

        String ip = address.getHostAddress();
        System.out.println(ip);
    }
}
