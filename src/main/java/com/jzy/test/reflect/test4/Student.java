package com.jzy.test.reflect.test4;

import javax.imageio.IIOException;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println("is studying");
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void sleep() {
        System.out.println("sleep");
    }

    private void eat(String sth) {
        System.out.println("is eating " + sth);
    }

    private String eat(String sth, int a) throws IIOException, NullPointerException, ClassCastException {
        System.out.println("is eating " + sth);
        return "奥利给";
    }

    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
