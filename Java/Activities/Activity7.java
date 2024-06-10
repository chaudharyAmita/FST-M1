package com.example;

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mBike = new MountainBike(3, 3, 40);
        System.out.println(mBike.bicycleDesc());
        mBike.speedUp(20);
        System.out.println("After SpeedUp : "+mBike.bicycleDesc());
        mBike.applyBrake(30);
        System.out.println("After Applying Brake : "+mBike.bicycleDesc());

    }

}
