package com.forezp.datastruct.test;

import com.forezp.datastruct.MyLinkList;

/**
 * Created by forezp on 2017/11/25.
 */
public class MyLinkListTest {

    public static void main(String[] args) {
        MyLinkList<String> linkList=new MyLinkList<>();
        linkList.add("ss1");
        linkList.add("ss2");
        linkList.add("ss3");
        System.out.println(linkList.get(0));
        System.out.println(linkList.get(1));
        System.out.println(linkList.remove(2));
    }
}
