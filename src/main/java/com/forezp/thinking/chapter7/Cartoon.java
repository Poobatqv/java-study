package com.forezp.thinking.chapter7;

import static com.forezp.thinking.Print.print;

/**
 * Created by forezp on 2017/11/30.
 */
public class Cartoon extends Drawing {

    public Cartoon() {
        print("cartoon construct");

    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
