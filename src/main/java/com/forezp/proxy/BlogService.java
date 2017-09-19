package com.forezp.proxy;

/**
 * 参考博客 http://www.cnblogs.com/cenyu/p/6289209.html
 * Created by fangzhipeng on 2017/9/19.
 */
public class BlogService implements IBlogService {

    @Override
    public void writeBlog() {
        System.out.println("i'm writing...");
    }
}
