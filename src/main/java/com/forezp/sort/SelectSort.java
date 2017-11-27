package com.forezp.sort;

/**
 * Created by forezp on 2017/11/25.
 * 选择排序
 *  选出最小的一个放在第一位
 */
public class SelectSort {

    public static void sort(Integer[]a) {

        for (int i = 0; i < a.length ; i++) {
            //第i个位置
            int min = i;
            //找出最小的索引
            for (int k = i+1; k < a.length ; k++) {
                if (a[k] < a[min]) {
                    min=k;
                }
            }
            //第i个位置和最小的交换位置
            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
    }

    public static void main(String[] args) {
        Integer []a={1,22,3,2,344,12,34};
        sort(a);
        for (Integer a1:a){
            System.out.println(a1);
        }
    }
}
