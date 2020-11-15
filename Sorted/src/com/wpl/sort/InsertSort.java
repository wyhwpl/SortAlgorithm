package com.wpl.sort;

/**
 * 插入排序
 */
public class InsertSort {

    private int[] arr;

    public InsertSort(int[] arr){
        this.arr=arr;
    }

    public int[] insertSort(){

        for (int i = 0; i < arr.length-1; i++) {
            int temp=arr[i+1];
            int j = i+1;
            for (; j >0; j--) {

                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j-1];
                }
                else break;
            }
            arr[j]=temp;
        }
        return arr;
    }
}
