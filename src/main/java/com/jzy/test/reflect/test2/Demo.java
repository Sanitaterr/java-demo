package com.jzy.test.reflect.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取构造方法

        Class cla = Class.forName("com.jzy.test.reflect.test2.Student");
//        Constructor[] constructors = cla.getConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor);
//        }

//        Constructor[] declaredConstructors = cla.getDeclaredConstructors();
//        for (Constructor declaredConstructor : declaredConstructors) {
//            System.out.println(declaredConstructor);
//        }

        Constructor declaredConstructor = cla.getDeclaredConstructor();
        System.out.println(declaredConstructor);

        Constructor declaredConstructor1 = cla.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor1);

        Constructor declaredConstructor2 = cla.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor2);

        Constructor declaredConstructor3 = cla.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor3);

        declaredConstructor3.setAccessible(true);
        int modifiers = declaredConstructor3.getModifiers();
        System.out.println(modifiers);

        Student stu = (Student) declaredConstructor3.newInstance("张三", 23);
        System.out.println(stu);
    }
}
