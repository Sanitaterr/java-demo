package com.jzy.test.IO;

import com.jzy.test.TestApplication;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/**
 * stream流练习
 * @author jzy
 */
public class StreamTest {
    public void f() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三丰-男-100", "张翠山-男-40",
                "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        List<String> newList1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(newList1);

        Set<String> newList2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newList2);

        /*
          前一个String表示流里每一个数据的类型, 和apply里的形参对应
          第二个String表示Map集合中键的数据类型, 和apply的返回类型对应
          map里键不能重复
         */
        Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));
        System.out.println(map);

        Map<String, String> map1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[2]));
        System.out.println(map1);


        ArrayList<Integer> index1 = new ArrayList<>();
        Collections.addAll(index1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> index2 = index1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(index2);



        Integer[] arr = {3, 5, 4, 1, 6, 2};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer - t1;
            }
        });
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, (a, b) -> a - b);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, TestApplication::subtraction);
        System.out.println(Arrays.toString(arr));

        ArrayList<String> arr2 = new ArrayList<>();
        Collections.addAll(arr2, "1", "2", "3", "4", "5");

        arr2.stream().map(Integer::parseInt).forEach(System.out::println);

        ArrayList<String> arr3 = new ArrayList<>();
        Collections.addAll(arr3, "aaa", "bbb", "ccc");
        List<String> arr4 = arr3.stream().map(s -> s.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(arr4);

        ArrayList<String> arr5 = new ArrayList<>();
        Collections.addAll(arr5, "张三", "李四", "张晓霞", "张文生", "谢晓", "秦明", "张兰", "张芷若");
        List<String> arr6 = arr5.stream().filter(s -> s.startsWith("张") && s.length() == 3).collect(Collectors.toList());
        System.out.println(arr6);

        ArrayList<String> arr7 = new ArrayList<>();
        Collections.addAll(arr7, "张三-32", "李四-12", "张晓霞-43", "张文生-23", "谢晓-19", "秦明-65", "张兰-56", "张芷若-42");
        List<String> arr8 = arr7.stream().filter(s -> Integer.parseInt(s.split("-")[1]) >= 18 && Integer.parseInt(s.split("-")[1]) <= 40).collect(Collectors.toList());
        System.out.println(arr8);

        ArrayList<Integer> arr9 = new ArrayList<>();
        Collections.addAll(arr9, 1, 2, 3, 4 ,5);
        Integer[] arr10 = arr9.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int i) {
                return new Integer[i];
            }
        });
        System.out.println(Arrays.toString(arr10));

        Integer[] arr11 = arr9.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr11));
    }
}
