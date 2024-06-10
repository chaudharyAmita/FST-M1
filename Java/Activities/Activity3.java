package com.example;

public class Activity3 {
    public static void main(String[] args) {
        int seconds = 1000000000;
        double earthSeconds = 31557600;
        double mercurySeconds = 0.2408467;
        double venusSeconds = 0.61519726;
        double marsSeconds = 1.8808158;
        double jupiterSeconds = 11.862615;
        double saturnSeconds = 29.447498;
        double uranusSeconds = 84.016846;
        double neptuneSeconds = 164.79132;

        System.out.println("Age on Earth = "+(seconds/earthSeconds));
        System.out.println("Age on Mercury = "+new Activity3().calculateAge(seconds, earthSeconds, mercurySeconds));
        System.out.println("Age on Venus = "+new Activity3().calculateAge(seconds, earthSeconds, venusSeconds));
        System.out.println("Age on Mars = "+new Activity3().calculateAge(seconds, earthSeconds, marsSeconds));
        System.out.println("Age on Jupiter = "+new Activity3().calculateAge(seconds, earthSeconds, jupiterSeconds));
        System.out.println("Age on Saturn = "+new Activity3().calculateAge(seconds, earthSeconds, saturnSeconds));
        System.out.println("Age on Uranus = "+new Activity3().calculateAge(seconds, earthSeconds, uranusSeconds));
        System.out.println("Age on Neptune = "+new Activity3().calculateAge(seconds, earthSeconds, neptuneSeconds));
    }

    double calculateAge(int seconds, double earthSeconds, double planetSeconds){
        double age = seconds/earthSeconds/planetSeconds;
        return age;

    }
}
