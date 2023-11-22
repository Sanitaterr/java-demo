package com.jzy.test.homework.work_11_15;

/**
 * @author JZY
 * @version 1.0
 * Create by 2023/11/17 8:24
 * @Description: 清蒸石斑鱼
 */
public class Fish extends Animal implements ChineseFood, EuropeanFood {
    private String name;

    public Fish() {
    }

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.print("the fish is eating grass");
    }

    @Override
    public void shout() {
        super.shout();
    }

    @Override
    public void cook() {
        System.out.println("用" + "\"" + SEASONING + "\"" + "烧" + name);
    }

    public void cooook() {}
}
