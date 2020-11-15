package com.wpl.sort;

/**
 * 希尔排序
 */
public class ShellSort {

    private int[] arr;

    public ShellSort(int[] arr){
        this.arr=arr;
    }

    public int[] shellSort(){

        int dt=arr.length;
        dt=dt/3+1;
        for(;dt>1;dt=dt/3+1){
            for (int j = dt; j <arr.length ; j++) {
                int temp = arr[j];
                int k = j - dt;
                while (k >= 0) {
                    if (arr[k] > arr[k + dt]) {
                        arr[k + dt] = arr[k];
                        k = k - dt;
                    } else break;
                }
                arr[k + dt] = temp;
            }
            
        }
        return arr;
    }
}
