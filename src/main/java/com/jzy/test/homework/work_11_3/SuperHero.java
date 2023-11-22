package com.jzy.test.homework.work_11_3;

import java.beans.JavaBean;

/**
 * @author jzy
 */
public class SuperHero {
    private String name;
    private String occupation;
    private String task;

    public SuperHero(String name, String occupation, String task) {
        this.name = name;
        this.occupation = occupation;
        this.task = task;
    }

    public void introduce() {
        System.out.println("我是" + name + "，我的职业是" + occupation + "，我的任务是" + task);
    }

    @Override
    public String toString() {
        return "SuperHero{name = " + name + ", occupation = " + occupation + ", task = " + task + "}";
    }
}
