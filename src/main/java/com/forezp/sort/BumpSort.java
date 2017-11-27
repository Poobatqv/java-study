package com.forezp.sort;

/**
 * Created by forezp on 2017/11/25.
 * 从大到小排序，比较相邻的，最小的在末尾
 *
 */
public class BumpSort {

    public static void sort(Integer[]a){
        int N=a.length;
        for(int i=1;i<N;i++){//只需要N-1趟
            for(int j=0;j<N-i;j++){//后面的元素已经排序好了
                if(a[j]<a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
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
