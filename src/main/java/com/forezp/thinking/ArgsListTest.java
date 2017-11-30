package com.forezp.thinking;

import java.util.Arrays;

/**
 * Created by forezp on 2017/11/30.
 */
public class ArgsListTest {

    public static void println(Object...args){
        System.out.println(Arrays.toString(args));
    }

    public static void main(String[] args) {
        println(1,2);
        println(3,"sswwew",10.12f);

    }
}
