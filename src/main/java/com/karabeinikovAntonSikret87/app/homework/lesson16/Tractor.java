package com.karabeinikovAntonSikret87.app.homework.lesson16;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class Tractor extends Machine {
    public Tractor(String vehicleName, int speedCurrentTimePeriod) {
        super(vehicleName, speedCurrentTimePeriod);
    }

    @Override
    public void getSpeedVehicle() {
        System.out.println("Tractor speed: " + getSpeedCurrentTimePeriod());
    }

    @Override
    public void getWeightVehicle() {
        System.out.println("Tractor weight: 1000");
    }

    @Override
    public void getAmountOfPassangers() {
        System.out.println("Tractor Amount of passangers: 2");
    }

    @Override
    public void getAmountOfWheels() {
        System.out.println("Tractor amount wheels: 4");
    }
}
