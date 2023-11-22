package com.jzy.test.util;

/**
 * @author jzy
 */
public class Tem<T> {
    private T a;
    private T b;

    public Tem(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public void sout() {
        System.out.println(a + " " + b);
    }
}
