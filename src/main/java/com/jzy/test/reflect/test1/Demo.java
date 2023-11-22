package com.jzy.test.reflect.test1;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取字节码文件

        // Class.forName()
        // 类名.class
        // 对象.getClass()
        Class c1 = Class.forName("com.jzy.test.reflect.test1.Student");
        System.out.println(c1);

        Class c2 = Student.class;
        System.out.println(c2);

        Student student = new Student();
        Class c3 = student.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
