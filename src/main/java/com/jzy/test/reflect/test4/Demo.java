package com.jzy.test.reflect.test4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("com.jzy.test.reflect.test4.Student");

        // 会包含父类中所有的公共方法
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

        // 不能获取父类的
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        Method getName = clazz.getDeclaredMethod("eat", String.class, int.class);
        getName.setAccessible(true);
        System.out.println(getName);

        // 获取eat方法的信息
        int modifiers = getName.getModifiers();
        System.out.println(modifiers);

        String name = getName.getName();
        System.out.println(name);
        int parameterCount = getName.getParameterCount();
        System.out.println(parameterCount);
        Parameter[] parameters = getName.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        Class[] exceptionTypes = getName.getExceptionTypes();
        for (Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        // 运行方法
        Student student = new Student();
        /*
          param1 方法的调用者
          param2 传递的参数
         */
        getName.setAccessible(true);
        String banana = (String) getName.invoke(student, "banana", 3);
        System.out.println(banana);

    }
}
