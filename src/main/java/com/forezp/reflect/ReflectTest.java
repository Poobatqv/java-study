package com.forezp.reflect;

import java.lang.reflect.Method;

/**
 * Created by forezp on 2017/10/15.
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("com.forezp.reflect.SayHi");
        Object o = c.newInstance();
        Method method = c.getMethod("sayHi", null);
        method.invoke(o, null);
        Method method2 = c.getMethod("sayHi", String.class);
        Object a = method2.invoke(o, "forezp");
        System.out.print(a);

    }
}
