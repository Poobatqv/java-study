package com.forezp.reflect;

/**
 * Created by forezp on 2017/10/15.
 */
public class SayHi {

    public void sayHi(){
        System.out.println("hi");
    }


    public String sayHi(String name){
        System.out.println("hi:"+name);
        return "i'm here";
    }

}
