package com.jzy.test.homework.work_11_15;

/**
 * @author JZY
 * @version 1.0
 * Create by 2023/11/17 8:24
 * @Description: TODO
 */
abstract public class Animal {
    private final String mouth = "mouth";
    public Animal() {
    }

    abstract public void eat();
    public void shout() {
        System.out.println(mouth + "shouting");
    }
}
