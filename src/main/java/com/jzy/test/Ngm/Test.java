package com.jzy.test.Ngm;

public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(bigStar);
        String str = proxy.sing("只因你太美");
        System.out.println(str);

        proxy.dance();
    }
}
