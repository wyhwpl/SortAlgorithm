package com.wpl.sort;

public class QuickSort {

    private int[] arr;

    public QuickSort(int [] arr){
        this.arr=arr;
    }
    public int[] quickSort(){
        quickSort(0,arr.length-1);
        return arr;
    }
    public void quickSort(int left,int right){

        if(left>=right) return;
        int pivot=partition(left, right);
        quickSort(left,pivot-1);
        quickSort(pivot+1,right);
    }
    public int partition(int left,int right){
        int pivot=arr[left];
        int index=left+1;
        int flag=0;
        while(left<right){
            if(flag==0){
                if(arr[right]<pivot){
                    arr[left]=arr[right];
                    left++;
                    flag=1;
                }
                else{
                    right--;
                }
            }
            if(flag==1){
                if(arr[left]>pivot){
                    arr[right]=arr[left];
                    right--;
                    flag=0;
                }
                else{
                    left++;
                }
            }


        }
        arr[left]=pivot;
        return left;

    }
}
