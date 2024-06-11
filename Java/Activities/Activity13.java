package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();
       
        System.out.println("Enter Integers please");
        System.out.println("Enter non integer to end input");

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Random Index generated is : "+index);
        System.out.println("Value in the array at index "+nums[index]);

        scan.close();
    }
}
