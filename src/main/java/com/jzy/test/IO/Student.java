package com.jzy.test.IO;

import java.io.Serial;
import java.io.Serializable;

/**
 * 学生类
 * Serializable接口是没有抽象方法的，这种接口叫做标记型接口
 * 一旦实现了这个接口，那么就表示当前的Student类可以被序列化
 * @author jzy
 */
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 3586325930705452932L;
    private String name;
    private Integer age;
    // 瞬态关键字
    // 不会把当前属性序列化到本地文件当中
    private transient String address;


    public Student() {
    }

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return adress
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", adress = " + address + "}";
    }
}