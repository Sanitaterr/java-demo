package com.jzy.test.TBS;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author l
 */
public class Main {

    public static void main(String[] args) {
        ITest t = LogProxy.gen(ITest.class, new TestImpl());
        System.out.println("Hello");
        t.test(1, 2);
    }
}


class LogProxy implements InvocationHandler {

    private static Map<Class<?>, Object> map = new HashMap<>();

    public static <T> T gen(Class<? extends T> c, T imp) {
        map.put(c, imp);
        return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{c}, new LogProxy());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        Class p = method.getDeclaringClass();
        System.out.println(String.format("invoke %s by %s", method.getName(), this));
        Object obj = map.getOrDefault(p, null);
        if (obj != null) {
            result = method.invoke(obj, args);
            System.out.println("method invoke done");
        } else {
            System.out.println("not has obj for invoke");
        }

        return result;
    }
}


interface ITest {
    void test(int i, int j);
}

class TestImpl implements ITest {

    @Override
    public void test(int i, int j) {
        System.out.println(String.format("%d + %d =%d", i, j, i + j));
    }
}