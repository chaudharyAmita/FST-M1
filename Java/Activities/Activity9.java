package com.example;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Anav");
        myList.add("Nihira");
        myList.add("Advan");
        myList.add("Viradhya");

        for(String s : myList){
            System.out.println(s);
        }

        System.out.println("Third Name in the list is : "+myList.get(2));
        System.out.println("Name Meera exists in the List : "+myList.contains("Meera"));
        System.out.println("Size of the List : "+myList.size());
        myList.remove(2);
        System.out.println("Size of the list after removing third name :"+myList.size());
        System.out.println("List again :");
        for(String s : myList){
            System.out.println(s);
        }

    }

}
