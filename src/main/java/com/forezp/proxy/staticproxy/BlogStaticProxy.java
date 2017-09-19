package com.forezp.proxy.staticproxy;

import com.forezp.proxy.IBlogService;

/**
 * Created by fangzhipeng on 2017/9/19.
 */
public class BlogStaticProxy {
    private IBlogService blogService;

    public BlogStaticProxy(IBlogService blogService) {
        this.blogService = blogService;
    }

    public void write() {
        System.out.println("start writing...");
        blogService.writeBlog();
        System.out.println("end writing...");
    }
}
