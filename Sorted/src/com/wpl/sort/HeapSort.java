package com.wpl.sort;

import java.util.Arrays;

/*
@author 汪培林

@create 2018-09-05-14:32
*/
public class HeapSort {

    private int[] arr;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }
    public int[] heapSort(){

        for (int i = arr.length/2-1; i >=0 ; i--) {
            adjustHeap(i,arr.length-1);
        }
        for (int i = arr.length-1; i >0; i--) {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            adjustHeap(0,i-1);
        }
        return arr;
    }

    public void adjustHeap(int parent,int n){

        int temp=arr[parent];
        int child=parent*2+1;
        while(child<=n){
            if((child+1)<=n&&arr[child]<arr[child+1]){
                child+=1;
            }
            if(arr[child]>temp){
                arr[parent]=arr[child];
                parent=child;
                child=parent*2;
            }
            else break;
        }
        arr[parent]=temp;
    }

}
