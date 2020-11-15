package com.wpl.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    private int[] arr;

    public BubbleSort(int[] arr){
        this.arr=arr;
    }
    public int[] bubbleSort(){
        for (int i = 0; i < arr.length-1; i++) {

            int temp=0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
