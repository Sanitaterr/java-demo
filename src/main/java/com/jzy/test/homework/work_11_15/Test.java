package com.jzy.test.homework.work_11_15;

import java.time.LocalDate;

/**
 * @author JZY
 * @version 1.0
 * Create by 2023/11/17 8:24
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        Fish fish = new Fish("东星斑");
        testCook(fish);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate = localDate.plusDays(1);
        System.out.println(localDate);
    }

    public static void testCook(Food food) {
        food.cook();
    }
}
