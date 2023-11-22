package com.jzy.test.Nam2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Subject implements Another {
    private String name;

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    @Override
    public Map<String, String> dothings(String[] s) {
        System.out.print(name + ": ");
        System.out.println(Arrays.toString(s));
        Map<String, String> mss = new HashMap<>();
        mss.put("message", "success");
        return mss;
    }
}
