package com.dsa;

public class InsertionSort {
    public static void displayArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        System.out.println();
        String arr[] = {"Algorithm","Debug","Bug","Compile"};
        System.out.println("Original Array");
        displayArray(arr);
        for(int i=1; i<arr.length;i++){
            String currentElement=arr[i];
            int j=i-1;
            while(j >= 0 && currentElement.compareTo(arr[j])<0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentElement;
        }
        System.out.println("Sorted Array");
        displayArray(arr);
    }
}
