package com.forezp.sort;

/**
 * Created by forezp on 2017/11/25.
 * 插入排序
 * 核心思想就是前面的排序，后面的元素插入到前面的已排序好的正确位置，通过遍历相邻的元素
 */
public class InsertSort {

    public static void sort(Integer[]a){

        int N=a.length;
        for(int i=1;i<N;i++){

            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
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
