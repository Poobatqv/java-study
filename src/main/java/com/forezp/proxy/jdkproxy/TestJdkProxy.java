package com.forezp.proxy.jdkproxy;

import com.forezp.proxy.BlogService;
import com.forezp.proxy.IBlogService;

/**
 * Created by fangzhipeng on 2017/9/19.
 */
public class TestJdkProxy {
    public static void main(String[] args) {

        IBlogService target = new BlogService();

        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IBlogService proxy = (IBlogService) new JdkBlogProxyFactory(target).newInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.writeBlog();
    }
}
