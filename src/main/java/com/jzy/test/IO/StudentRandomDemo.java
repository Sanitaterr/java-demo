package com.jzy.test.IO;

public class StudentRandomDemo {
    public String name;
    public double weight;

    public StudentRandomDemo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "StudentRandomDemo{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
