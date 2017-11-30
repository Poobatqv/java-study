package com.forezp.test;

import com.forezp.thinking.chapter7.ProtectTest;

/**
 * Created by forezp on 2017/11/30.
 */
public class ProtectSubTest extends ProtectTest {

    public static void main(String[] args) {
        ProtectSubTest protectSubTest=new ProtectSubTest();
       // protectSubTest.print();
        // 不写protected private public 则为包内访问权限，protected包含包内访问权限
        //但是 包内访问权限不等于protected
    }
}
