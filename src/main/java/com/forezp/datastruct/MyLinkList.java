package com.forezp.datastruct;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by forezp on 2017/11/25.
 */
public class MyLinkList<T> implements Iterable<T> {

    private int size;
    private int modeCount = 0;
    private Node<T> beginMarker;
    private Node<T> endMarker;

    public MyLinkList() {
        doClear();
    }

    private void doClear() {
        size = 0;
        modeCount++;
        beginMarker = new Node<T>(null, null, null);
        endMarker = new Node<T>(null, beginMarker, null);
        beginMarker.next = endMarker;
    }

    public boolean add(T data) {
        Node<T> node = new Node<>(data, endMarker.prev, endMarker);
        endMarker.prev.next = node;
        endMarker.prev = node;
        modeCount++;
        size++;
        return true;
    }

    public T remove(int index) {
        Node<T> node = getNode(index);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        modeCount--;
        return node.data;
    }

    public Node<T> getNode(int index) {
        Node<T> p;
        if (index < 0 | index >= size) {
            throw new IndexOutOfBoundsException("out of index");
        }
        if (index < size / 2) {//从左边开始找
            p = beginMarker.next;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }

        } else {//从右边开始找
            p = endMarker;
            for (int i = size; i > index; i--) {
                p = p.prev;
            }

        }
        return p;
    }

    public T get(int index) {

        return getNode(index).data;

    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    static class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }


    }
}
