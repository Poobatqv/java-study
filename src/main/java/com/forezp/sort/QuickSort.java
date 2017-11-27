package com.forezp.sort;

/**
 * Created by forezp on 2017/11/25.
 */
public class QuickSort {


    public static void  sort(Integer[]a,int left,int right){
        if(left>right){
            return;
        }

        int i=left,j=right;//2个哨兵
        int temp=a[left];//基准
        while (true){
            //顺序很重要，从右边开始，找出小于temp的数
            while (a[j]>=temp&&i<j){
                j--;
            }
            //从左边找出比temp大的数
            while (a[i]<=temp&&i<j){
               i++;
            }

            if(i>=j){//跳出循环
                break;
            }
            //交换
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        //交换基点
        a[left]=a[i];
        a[i]=temp;
        sort(a,left,i-1);
        sort(a,i+1,right);
    }

    public static void main(String[] args) {
        Integer[]a={21,2,32,23,45,12,34,1,4,3};
        sort(a,0,a.length-1);
        for (Integer a1:a){
            System.out.println(a1);
        }
    }

}
