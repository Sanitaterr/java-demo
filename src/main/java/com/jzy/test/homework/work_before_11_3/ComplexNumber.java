package com.jzy.test.homework.work_before_11_3;

/**
 * 复数类
 * @author jzy
 */
public class ComplexNumber {
    private double realPart;
    private double imagePart;

    public ComplexNumber(double realPart, double imagePart) {
        this.realPart = realPart;
        this.imagePart = imagePart;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    @Override
    public String toString() {
        return realPart + (imagePart >= 0 ? "+" : "") + imagePart + "i";
    }

    public void add(ComplexNumber complexNumber) {
        realPart += complexNumber.realPart;
        imagePart += complexNumber.imagePart;
    }

    public void sub(ComplexNumber complexNumber) {
        realPart -= complexNumber.realPart;
        imagePart -= complexNumber.imagePart;
    }

    public void mul(ComplexNumber complexNumber) {
        double newRealPart = realPart * complexNumber.realPart - imagePart * complexNumber.imagePart;
        double newImagePart = imagePart * complexNumber.realPart + realPart * complexNumber.imagePart;
        realPart = newRealPart;
        imagePart = newImagePart;
    }

    public void div(ComplexNumber complexNumber) {
        double divider = complexNumber.realPart * complexNumber.realPart + complexNumber.imagePart * complexNumber.imagePart;
        double newRealPart = (realPart * complexNumber.realPart + imagePart * complexNumber.imagePart) / divider;
        double newImagePart = (imagePart * complexNumber.realPart - realPart * complexNumber.imagePart) / divider;
        realPart = newRealPart;
        imagePart = newImagePart;
    }
}
