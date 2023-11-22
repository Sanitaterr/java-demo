package com.jzy.test.Nam2;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject("MySubject");
        Another proxy = ProxyUtil.createProxy(subject);
        Map<String, String> mss = proxy.dothings(new String[]{"eating", "sleeping", "running"});
        System.out.println(mss.get("message"));
    }
}
