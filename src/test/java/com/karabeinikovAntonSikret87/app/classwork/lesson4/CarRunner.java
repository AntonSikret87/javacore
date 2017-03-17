package com.karabeinikovAntonSikret87.app.classwork.lesson4;

/**
 * Created by AntonKa on 3/17/2017.
 */
public class CarRunner {

    public static void main( String[] args ){
        Car bmw = new Car();
        bmw.name = "Seria 3 e46 2.0";
        Car toyota = new Car();
        toyota.name = "Corolla";
        System.out.println("First car name: " + bmw.name );
        System.out.println("Second car name: " + toyota.name + ", wheels number: " + Car.wheelsCounter);
        Car.wheelsCounter++;
        System.out.println("wheels + 1: " + Car.wheelsCounter);
        Car.driver();
        System.out.println("Dooors: " + Car.doorsCounter);
        Car.speed(80);
        Car.addDoorsAndWheels(Car.wheelsCounter, Car.doorsCounter);
        System.out.println("PI is: " + Car.PI);

    }
}
