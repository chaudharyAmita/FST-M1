package com.example;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> color = new HashMap<Integer, String>();
        color.put(1, "Black");
        color.put(2, "Red");
        color.put(3, "Yellow");
        color.put(4, "Green");
        color.put(5, "Blue");

        System.out.println("Print Map: "+color);
        color.remove(3);
        System.out.println("Green color exists in the Map : "+color.containsValue("Green"));
        System.out.println("Size of the Map after update : "+color.size());
        System.out.println("Print Updated Map : "+color);
        


    }

}
