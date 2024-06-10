package com.example;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        doors =4;
        tyres =4;
    }

    public void displayCharaterstics(){
        System.out.println("Values are  : ");
        System.out.println("Color of the Car is "+color+" and make is "+make);
        System.out.println("Transmission is "+transmission);
        System.out.println("No.of tyres = "+tyres+" and no. of doors ="+doors);
    }
        
       

    public void accelerate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }

}
