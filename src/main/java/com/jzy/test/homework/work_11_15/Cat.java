package com.jzy.test.homework.work_11_15;

/**
 * @author JZY
 * @version 1.0
 * Create by 2023/11/17 8:24
 * @Description: TODO
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("the cat is eating fish");
    }

    @Override
    public void shout() {
        System.out.println("the cat is shouting: \"miao miao~~\"");
    }

    public void catt(int a) {
        System.out.println("catt");
    }
}
