package com.forezp.datastruct.test;

import com.forezp.datastruct.BinarySearchTree;

/**
 * Created by forezp on 2017/11/27.
 */
public class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree=new BinarySearchTree<>();
        tree.insert(500);
        tree.insert(12);
        tree.insert(21);
        tree.insert(341);
        tree.insert(441);
        tree.insert(331);
        tree.insert(1111);
        tree.insert(112);
        tree.insert(221);
        tree.insert(3341);
        tree.insert(4441);
        tree.insert(10000);
        tree.insert(3431);
        tree.insert(1);
        System.out.println(tree.findMax());
        System.out.println(tree.findMin());
        System.out.println(tree.contains(12));
    }
}
