package com.forezp.datastruct;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by forezp on 2017/11/26.
 */
public class MyHashMap<K, V> {

    private final int DEFAULT_SIZE = 16;

    private Node<K, V>[] theItems;
    private int theSize;
    private int modeCount;


    public MyHashMap() {
        theSize = 0;
        modeCount = 0;
        theItems = null;
        theItems = (Node<K, V>[]) new Node[DEFAULT_SIZE];
    }


    public void put(K key, V value) {
        //没有考虑key重复等等的情况
        Node<K, V> pNode = theItems[findItemIndex(key)];
        if (pNode == null) {
            Node<K, V> newNode = new Node<>(key.hashCode(), key, value, null);
            theItems[findItemIndex(key)] = newNode;
        } else {
            Node<K, V> lastNode = pNode;
            while (true) {
                if (lastNode.next != null) {
                    lastNode = lastNode.next;
                } else {
                    break;
                }
            }
            if (lastNode == null) {
                throw new RuntimeException("ooopppss,last node not find");
            }
            Node<K, V> newNode = new Node<>(key.hashCode(), key, value, null);
            lastNode.next = newNode;
            theSize++;
            modeCount++;
        }
    }

    public V get(K key) {
        Node<K, V> pNode = theItems[findItemIndex(key)];
        if (pNode == null) {
            return null;
        }
        int hashcode = key.hashCode();
        if (pNode.hash == hashcode) {
            return pNode.value;
        }
        Node<K, V> target;
        while (true) {
            target = pNode.next;
            if (target.hash == hashcode || target.next == null) {
                break;
            }
        }
        if (target == null) {
            return null;
        } else {
            return target.value;
        }
    }

    private int findItemIndex(K key) {
        int hashcode = Math.abs(key.hashCode());
        return hashcode % 16;
    }

    static class Node<K, V> {
        private int hash;
        private K key;
        private V value;

        Node<K, V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public int getHash() {
            return hash;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Node<K, V> getNext() {
            return next;
        }
    }

}
