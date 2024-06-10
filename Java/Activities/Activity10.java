package com.example;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Banana");
        hs.add("papaya");
        hs.add("Kiwi");
        hs.add("Orange");
        
        System.out.println("Hashset Initially : ");
        for(String s : hs){
            System.out.println(s);
        }
        System.out.println("Size of thne HashSet : "+hs.size());
        hs.remove("Mango");
        hs.remove("watermelon");
        System.out.println("Muskmelon is in the set: "+hs.contains("MuskMelon"));
        System.out.println("Updated set : ");
        for(String s : hs){
            System.out.println(s);
        }
    }
    
    

}
