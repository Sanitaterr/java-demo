package com.jzy.test.homework.work_11_17;

import java.util.Arrays;

/**
 * @author JZY
 * @version 1.0
 * Create by 2023/11/17 9:15
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Plant plant = new Plant();
        Kite kite = new Kite();
        fly(bird, plant, kite);

    }

    public static void fly(Fly... flies) {
        Arrays.stream(flies).forEach(Fly::fly);
    }
}

class Animal {

}

class Bird extends Animal implements Fly {

    @Override
    public void fly() {
        System.out.println("bird is flying");
    }
}

class Plant implements Fly {

    @Override
    public void fly() {
        System.out.println("plant is flying");
    }
}

class Kite implements Fly {

    @Override
    public void fly() {
        System.out.println("kite is flying");
    }
}
interface Fly {
    void fly();
}
