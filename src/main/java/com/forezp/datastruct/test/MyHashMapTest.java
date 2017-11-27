package com.forezp.datastruct.test;

import com.forezp.datastruct.MyHashMap;

/**
 * Created by forezp on 2017/11/27.
 */
public class MyHashMapTest {

    public static void main(String[] args) {
        MyHashMap<String,String> map=new MyHashMap<>();
        map.put("xx","1");
        map.put("xzss","2");
        map.put("sss","2");
        map.put("sss","2");
        map.put("sss3","2");
        System.out.println(map.get("sss3"));
    }
}
