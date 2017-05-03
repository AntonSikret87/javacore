package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.Encaps.encapsulation.encapsulationRunner;

import com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.Encaps.encapsulation.Car;

/**
 * Created by AntonKa on 4/28/2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarName("My Car is Audi");
        String myNameCar = car.getCarName();
        System.out.println(myNameCar);
        car.shiftCarGear();

    }
}
