package com.example;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane myPlane = new Plane(10);
        myPlane.onboard("A");
        myPlane.onboard("B");
        myPlane.onboard("C");
        myPlane.onboard("D");
        myPlane.onboard("E");
        myPlane.onboard("F");
        myPlane.onboard("G");
        myPlane.onboard("H");
        myPlane.onboard("I");
        myPlane.onboard("J");

        System.out.println("Passengers are : "+myPlane.getPassengers());
        System.out.println("Take off Time : "+myPlane.takeOff());
        Thread.sleep(10000);
        myPlane.land();
        System.out.println("Landing time : "+myPlane.getLastTimeLanded());
        System.out.println("Passengers After landing : "+myPlane.getPassengers());
    }
}
