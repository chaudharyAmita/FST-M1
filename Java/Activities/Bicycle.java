package com.example;

public class Bicycle implements BicycleParts, BicycleOperations {
    int gears;
    int speed;

    public Bicycle(int gears, int currentSpeed){
        this.gears = gears;
        this.speed = currentSpeed;
    }
    @Override
    public void applyBrake(int decrement) {
        speed-=decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed+=increment;
    }

    public String bicycleDesc(){
        return ("Gears in the Bicycle are : "+gears+ "\nCurrent Speed of the bicycle is "+speed);
    }
    

}
