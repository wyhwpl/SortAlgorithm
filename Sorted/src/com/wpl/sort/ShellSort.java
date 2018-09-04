package com.wpl.sort;

public class ShellSort {

    private int[] arr;

    public ShellSort(int[] arr){
        this.arr=arr;
    }

    public int[] shellSort(){

        int dt=arr.length;
        dt=dt/3+1;
        for(;dt>0;dt=dt/3+1){
            for (int j = dt; j <arr.length ; j++) {
                int temp=arr[j];
                int k=j-dt;

            }
            
        }
    }
}
