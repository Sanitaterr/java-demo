package com.jzy.test.homework.work_11_15;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        Consumer<Hello> helloIntegerBiConsumer = Hello::hello;
        System.out.println(helloIntegerBiConsumer);
    }
}

class Hello {
    private int a;
    public void hello() {
        System.out.println("Hello");
    }
    
    public int hello(int x) {
        System.out.println("Hello X");
        return 3;
    }
}
