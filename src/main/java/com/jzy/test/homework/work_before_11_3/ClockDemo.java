package com.jzy.test.homework.work_before_11_3;

/**
 * @author jzy
 */
public class ClockDemo {
    public static void main(String[] args) {
        Clock clock = new Clock(new Display(23, 24), new Display(58, 60), new Display(10, 60));
        clock.start();
    }
}
