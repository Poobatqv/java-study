package com.forezp.proxy.cglibproxy;

import com.forezp.proxy.BlogService;
import com.forezp.proxy.IBlogService;

/**
 * Created by fangzhipeng on 2017/9/19.
 */
public class TestCglib {

    public static void main(String[] args) {
        IBlogService target = new BlogService();
        //代理对象
        IBlogService proxy = (IBlogService) new CglibBlogFactory(target).getProxyInstance();
        //执行代理对象的方法
        proxy.writeBlog();
    }
}
