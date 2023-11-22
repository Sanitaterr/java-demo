package com.jzy.test.homework.work_before_11_3;

import com.jzy.test.IO.StudentRandomDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomDeom {
    public static void main(String[] args) {
        // 假设拿到数据并塞入集合之后
        ArrayList<StudentRandomDemo> list = new ArrayList<>();
        Collections.addAll(list,
                new StudentRandomDemo("张三", 1),
                new StudentRandomDemo("李四", 1),
                new StudentRandomDemo("王五", 1),
                new StudentRandomDemo("钱六", 1),
                new StudentRandomDemo("赵七", 1),
                new StudentRandomDemo("Tom", 1),
                new StudentRandomDemo("Alice", 1),
                new StudentRandomDemo("Jack", 1),
                new StudentRandomDemo("Osk", 1),
                new StudentRandomDemo("川本", 1)
        );
        double weight = 0;
        for (StudentRandomDemo s : list) {
            weight += s.weight;
        }
        double[] arr = new double[list.size()];
        int idx = 0;
        for (StudentRandomDemo s : list) {
            arr[idx ++ ] = s.weight / weight;
        }
        for (int i = 1; i < arr.length; i ++ ) {
            arr[i] += arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));
        double number = Math.random();
        int res = -Arrays.binarySearch(arr, number) - 1;
        StudentRandomDemo studentRandomDemo = list.get(res);
        double w = studentRandomDemo.weight / 2;
        studentRandomDemo.weight = w;
        System.out.println(studentRandomDemo);
        // 再写入数据
    }
}
