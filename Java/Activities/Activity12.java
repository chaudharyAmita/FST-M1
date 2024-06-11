package com.example;

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = ( a, b) ->  (a+b);
        System.out.println(ad1.add(2,4));
        Addable ad2 = ( c,  d) -> { return c+d; };
        System.out.println(ad2.add(5, 2));
    }

}
