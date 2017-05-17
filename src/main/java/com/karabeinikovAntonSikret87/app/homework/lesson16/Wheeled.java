package com.karabeinikovAntonSikret87.app.homework.lesson16;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class Wheeled extends Tractor {
    public Wheeled(String vehicleName, int speedCurrentTimePeriod) {
        super(vehicleName, speedCurrentTimePeriod);
    }

    @Override
    public void getSpeedVehicle() {
        System.out.println("Wheeled Tracked Tractor speed: " + getSpeedCurrentTimePeriod());
    }

    @Override
    public void getWeightVehicle() {
        System.out.println("Wheeled Tractor weight: 2000");
    }

    @Override
    public void getAmountOfPassangers() {
        System.out.println("Wheeled Tractor Amount of passangers: 1");
    }

    @Override
    public void getAmountOfWheels() {
        System.out.println("Wheeled Tractor amount wheels: 0");
    }
}
