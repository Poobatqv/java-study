package com.forezp.proxy.jdkproxy;

import com.forezp.proxy.IBlogService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fangzhipeng on 2017/9/19.
 */

public class JdkBlogProxyFactory {

    private Object target;

    public JdkBlogProxyFactory(Object target) {
        this.target = target;
    }

    public Object newInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("start writing");
                    Object o = method.invoke(target, args);
                    System.out.println("end writing");
                    return o;
                });
    }
}
