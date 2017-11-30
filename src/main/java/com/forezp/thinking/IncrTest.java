package com.forezp.thinking;

/**
 * Created by forezp on 2017/11/28.
 */
public class IncrTest {

    public static void main(String[] args) {
        int i=1;
        println("i:"+ i);
        println("++i:"+ ++i);
        println("i++:"+ i++);
        println("i:"+ i);
        println("--i:"+ --i);
        println("i--:"+ i--);
        println("i:"+ i);

    }

    public static void println(Object o){
        System.out.println(o);
    }
}
