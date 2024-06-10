package com.example;

public class MountainBike extends Bicycle{
    int seatHeight;

    public MountainBike(int seatHeight, int gears, int speed){
        super(gears, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newHeight){
        seatHeight = newHeight;
    }

    @Override
    public String bicycleDesc(){
        return (super.bicycleDesc()+ "\nSeat height is "+seatHeight);
    }

}
