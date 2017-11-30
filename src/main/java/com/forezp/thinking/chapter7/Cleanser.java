package com.forezp.thinking.chapter7;

import com.forezp.thinking.Print;

import java.util.Scanner;

/**
 * Created by forezp on 2017/11/30.
 */
public class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append("dilute()");
    }

    public void apply() {
        append("apply()");
    }

    public void subcribe() {
        append("subcribe()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser scanner = new Cleanser();
        scanner.dilute();
        scanner.apply();
        scanner.subcribe();
        Print.print(scanner);
    }
}
