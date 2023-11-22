package com.jzy.test.reflect.test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 反射可以和配置文件结合，动态地创建对象，并调用方法
        Properties prop = new Properties();
        FileInputStream fileInputStream = new FileInputStream("D:\\SpringBoot\\test\\src\\main\\resources\\application.properties");
        prop.load(fileInputStream);
        fileInputStream.close();
        System.out.println(prop);

        String s = (String) prop.get("classname");
        String m = (String) prop.get("method");
        System.out.println(s);
        System.out.println(m);

        // 利用反射创建对象并运行方法
        Class clazz = Class.forName(s);

        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        System.out.println(o);
        // 如果是像上面三行利用空参构造创建对象的话，还有更简单的方式
//        Object o = clazz.newInstance();

        Method method = clazz.getDeclaredMethod(m);
        method.setAccessible(true);
        method.invoke(o);

    }
}
