package com.example;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,10,12,1,5,6};
        System.out.println(Arrays.toString(arr));

        new Activity4().insertionSort(arr);
    }
    public void insertionSort(int[] arr){
        for(int i =1; i<arr.length; i++){
            for(int j=i; j>0;j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

}
