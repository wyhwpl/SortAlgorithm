package com.wpl.sort;

import java.util.Scanner;

public class Main {
    public void Print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        Main m=new Main();
        System.out.print("bubbleSort: ");
        m.Print(new BubbleSort(arr).bubbleSort());
        System.out.print("selectionSort: ");
        m.Print(new SelectionSort(arr).selectionSort());
        System.out.print("insertSort: ");
        m.Print(new InsertSort(arr).insertSort());
        System.out.print("quickSort: ");
        m.Print(new QuickSort(arr).quickSort());
        System.out.print("shellSort: ");
        m.Print(new ShellSort(arr).shellSort());
        System.out.print("heapSort: ");
        m.Print(new HeapSort(arr).heapSort());
    }
}
