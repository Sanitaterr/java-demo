package com.jzy.test.Nam2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ProxyUtil {

    public static Another createProxy(Subject subject) {
        Another another = (Another) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Another.class}, new InvocationHandler() {
            @Override
            public Map<String, String> invoke(Object o, Method method, Object[] objects) throws Throwable {
                Map<String, String> mss = new HashMap<>();
                if ("dothings".equals(method.getName())) {
                    System.out.println("begin~~~");
                     mss = (Map<String, String>) method.invoke(subject, objects);
                    System.out.println("end~~~");
                }
                return mss;
            }
        });
        return another;
    }
}
