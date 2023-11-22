package com.jzy.test.homework.work_11_3;

/**
 * @author jzy
 */
public class Hulk extends SuperHero {
    private String weapon;

    public Hulk(String name, String occupation, String task, String weapon) {
        super(name, occupation, task);
        this.weapon = weapon;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("我使用的武器是：" + weapon);
    }
}
