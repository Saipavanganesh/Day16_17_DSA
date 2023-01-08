package com.dsa;

public class BubbleSort {
    public static void displayArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int arr[]={8,7,1,2,6};
        System.out.println("Original Array");
        displayArray(arr);
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array");
        displayArray(arr);
    }
}
