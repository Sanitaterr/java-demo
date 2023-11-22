package com.jzy.test.homework.work_before_11_3;

/**
 * @author jzy
 */
public class Display {
    private int value;
    private int limit;

    public Display(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public Display() {}

    public int getLimit() {
        return limit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0 && value < limit) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Invalid value: " + value);
        }
    }

    public void increase() {
        this.value ++ ;
    }
}
