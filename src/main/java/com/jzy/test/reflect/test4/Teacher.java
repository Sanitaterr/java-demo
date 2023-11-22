package com.jzy.test.reflect.test4;

public class Teacher {
    private String name;
    private double bonus;

    public Teacher() {
    }

    public Teacher(String name, double bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public void teach() {
        System.out.println("is teaching");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Teacher{name = " + name + ", bonus = " + bonus + "}";
    }
}
