package com.forezp.datastruct.test;

import com.forezp.datastruct.MyArrayList;

/**
 * Created by forezp on 2017/11/25.
 */
public class MyArrayListTest {

    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();
        list.add("0");
        list.add("1");
        list.add(1,"2");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.remove(1));
    }
}
