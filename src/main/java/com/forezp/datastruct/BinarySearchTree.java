package com.forezp.datastruct;

/**
 * Created by forezp on 2017/11/27.
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    private BinaryNode<T> root;
    private int size;
    private int modeCount;

    public void insert(T date) {
        root = insert(date, root);
    }

    public BinaryNode<T> insert(T data, BinaryNode<T> t) {

        if (t == null) {
            return new BinaryNode<>(data);
        }
        if (data.compareTo(t.data) < 0) {
            t.left = insert(data, t.left);
        } else if (data.compareTo(t.data) > 0) {
            t.right = insert(data, t.right);
        } else {//相等的情况
            //TODO
        }
        size++;
        modeCount++;
        return t;
    }

    public boolean contains(T data) {
        if (root == null) {
            return false;
        } else {
            return contains(data, root);
        }
    }

    public boolean contains(T data, BinaryNode<T> t) {
        if (t == null) {
            return false;
        }
        int compareNum = data.compareTo(t.data);

        if (compareNum < 0) {
            return contains(data, t.left);
        } else if (compareNum > 0) {
            return contains(data, t.right);
        } else {
            return true;
        }

    }

    public T findMax() {
        if (root == null) {
            return null;
        }
        BinaryNode<T> t = findMax(root);
        if (t != null) {
            return t.data;
        } else {
            return null;
        }

    }

    public BinaryNode<T> findMax(BinaryNode t) {

        if (t != null) {
            while (t.right != null) {
                t = t.right;
            }
        }
        return t;
    }

    public T findMin() {
        if (root == null) {
            return null;
        }
        BinaryNode<T> t = findMin(root);
        if (t != null) {
            return t.data;
        } else {
            return null;
        }

    }

    public BinaryNode<T> findMin(BinaryNode t) {
        if (t == null) {
            return null;
        } else if (t.left == null) {
            return t;
        }
        return findMin(t.left);

    }

    static class BinaryNode<T> {

        T data;
        BinaryNode<T> left;
        BinaryNode<T> right;

        public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public BinaryNode(T data) {
            this(data, null, null);
        }
    }


}
