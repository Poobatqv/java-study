package com.forezp.proxy.staticproxy;

import com.forezp.proxy.BlogService;
import com.forezp.proxy.IBlogService;

/**
 * Created by fangzhipeng on 2017/9/19.
 */
public class TestStaticProxy {

    public static void main(String[] args) {
        IBlogService target = new BlogService();
        BlogStaticProxy proxy = new BlogStaticProxy(target);
        proxy.writeBlog();
    }
}
