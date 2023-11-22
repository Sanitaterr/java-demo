package com.jzy.test.homework.work_before_11_3;

/**
 * @author jzy
 */
public class Circle {
    private double radius = 0;

    @Override
    public String toString() {
        return "这是一个半径为" + radius + "的圆";
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
