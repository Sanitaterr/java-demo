package com.jzy.test.Ngm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    /**
     * 给一个BigStar对象创建一个代理
     * 形参：被代理的BigStar对象
     * 返回值：给BigStar创建的代理
     * 需求：想要BigStar唱歌
     *      1.获取代理的对象
     *          代理对象 = ProxyUtil.createProxy(...)
     *      2.再调用代理的唱歌方法
     *          代理方法.sing("歌曲的名称")
     */
    public static Star createProxy(BigStar bigStar) {
        /**
         * 参数一：用于指定用哪个类加载器，去加载生成的代理类
         * 参数二：指定接口，这些接口用于指定生成的代理长什么样，也就是有哪些方法，是一个数组，可以写多个接口
         * 参数三：用来指定生成的代理对象要干什么事情
         */
        Star star = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                /**
                 * 参数一：代理的对象
                 * 参数二：要运行的方法 sing
                 * 参数三：调用sing方法时传递的实参
                 */
                if ("sing".equals(method.getName())) {
                    System.out.println("准备话筒，收钱");
                } else if ("dance".equals(method.getName())) {
                    System.out.println("准备场地，收钱");
                }

                // 调用BigStar里的方法
                // 方法有返回值的话直接返回
                return method.invoke(bigStar, objects);
            }
        });
        return star;
    }
}
