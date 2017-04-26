package com.karabeinikovAntonSikret87.app.homework.lesson12;

/**
 * Created by AntonKa on 4/26/2017.
 */
public class HomeWorkLesson12Runner {
    public static void main(String[] args) {

        BicycleWithRing bicycleWithRing = new BicycleWithRing();
        bicycleWithRing.ring();
        bicycleWithRing.setSpeed(2);

//        CustomBicycle customBicycle = new CustomBicycle();
//        customBicycle.ring();
//        customBicycle.setSpeed(30);

        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        bicycleWithRingInterface.ring();

        Bicycle bicycle = new CustomBicycle();
        bicycle.setGear(88);
        bicycle.ride();
    }
}

//Diling
//Biccle speed 2
//Diling
// geer 88
//Wshhhh

