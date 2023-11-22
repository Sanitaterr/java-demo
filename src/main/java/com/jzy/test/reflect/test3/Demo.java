package com.jzy.test.reflect.test3;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("com.jzy.test.reflect.test3.Student");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field gender = clazz.getField("gender");
        System.out.println(gender);

        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        // 获取成员变量的信息
        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        String name1 = name.getName();
        System.out.println(name1);

        Class<?> type = name.getType();
        System.out.println(type);

        Student student = new Student("张三", 23, "男");
        name.setAccessible(true);
        String o = (String) name.get(student);
        System.out.println(o);

        // 修改对象里记录的值
        name.set(student, "刘家硬");
        System.out.println(student);

    }
}
