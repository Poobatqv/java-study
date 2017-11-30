package com.forezp.thinking.chapter7;

import static com.forezp.thinking.Print.print;

/**
 * Created by forezp on 2017/11/30.
 */
public class Cheese extends BoardGame {

    public Cheese(){
        super(11);
        print("cheese");
    }

    public static void main(String[] args) {
        Cheese cheese=new Cheese();

    }
}
