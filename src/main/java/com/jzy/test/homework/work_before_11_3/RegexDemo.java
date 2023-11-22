package com.jzy.test.homework.work_before_11_3;

public class RegexDemo {
    public void f() {
          String regex = "(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
          System.out.println("23:11:02".matches(regex));
          String regex2 = "(\\d{8}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}$)|(^\\d{6}(18|19|20)\\d{2}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}(\\d|X|x))";
        System.out.println("330185200406170037".matches(regex2));
    }
}
