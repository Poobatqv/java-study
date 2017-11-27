package com.forezp.datastruct.test;

import com.forezp.datastruct.MaxPQ;

/**
 * Created by forezp on 2017/11/27.
 */
public class MaxPQTest {

    public static void main(String[] args) {
        MaxPQ<Integer> pq=new MaxPQ<>(10);
        pq.insert(1);
        pq.insert(2);
        pq.insert(3);
        pq.insert(4);
        pq.insert(5);
        pq.insert(6);
        pq.insert(7);
        System.out.println(pq);
        System.out.println(pq.delete());
        System.out.println(pq);
        System.out.println(pq.delete());
        System.out.println(pq);
        System.out.println(pq.delete());
        System.out.println(pq);
        System.out.println(pq.delete());
        System.out.println(pq);
        System.out.println(pq.delete());
        System.out.println(pq);
        System.out.println(pq.delete());
        System.out.println(pq);
        System.out.println(pq.delete());
        System.out.println(pq);
        System.out.println(pq.delete());
        System.out.println(pq);
    }
}
