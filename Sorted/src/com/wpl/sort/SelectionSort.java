package com.wpl.sort;

public class SelectionSort {

    private int[] arr;

    public SelectionSort(int[] arr){
        this.arr=arr;
    }
    public int[] selectionSort(){

        for (int i = 0; i <arr.length ; i++) {
            int min=arr[i];
            int minIndex=i;
            int temp;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;

    }
}
