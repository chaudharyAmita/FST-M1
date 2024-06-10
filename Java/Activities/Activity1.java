package com.example;

public class Activity1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = 2018;
        myCar.color = "Silver";
        myCar.transmission = "Manual";

        myCar.displayCharaterstics();
        myCar.accelerate();
        myCar.brake();
    }
   
}
