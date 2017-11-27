package com.forezp.datastruct;

import java.util.Arrays;

/**
 * Created by forezp on 2017/11/27.
 * max priority quene
 * insert : insert last index and swim,size++
 * delete : last index exchange first index and return first item ,size--;
 * k .children-{2k 2k+1}
 * k .parent-{ }
 */
public class MaxPQ<K extends Comparable<K>> {

    //0的位置不存数据，存数据从1开始
    private K[] pq;
    private int N = 0;

    public MaxPQ(int size) {
        pq = (K[]) new Comparable[size + 1];
    }

    public void insert(K key) {
        pq[++N] = key;
        swim(N);
    }

    public K delete() {
        if(N==0){
            return null;
        }
        K maxKey = pq[1];
        //1和N+1交换
        pq[1] = pq[N--];
        pq[N + 1] = null;
        sink(1);
        return maxKey;

    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
               break;
            }
            K temp = pq[k];
            pq[k] = pq[j];
            pq[j] = temp;
            k = j;
        }

    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            //如果父节点<子节点
            K temp = pq[k / 2];
            pq[k / 2] = pq[k];
            pq[k] = temp;
            k = k / 2;
        }

    }

    private boolean less(int k1, int k2) {
        return pq[k1].compareTo(pq[k2]) < 0 ? true : false;
    }


    @Override
    public String toString() {
        return "MaxPQ{" +
                "pq=" + Arrays.toString(pq) +
                ", N=" + N +
                '}';
    }
}
