package com.example;

public class Activity2 {
    public static void main(String[] args){
        int[] arr = {10, 77, 10, 54, -11, 10};
        int sum=0;
        for(int i : arr){
            if(i == 10)
            sum = sum+i;
        }
        if (sum == 30)
        System.out.println("Yes the sum of 10s in the array is 30");
        else
        System.out.println("No, the sum of 10s in the array is not 30");

    }

}
