package com.karabeinikovAntonSikret87.app.homework.lesson16;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class Tracked extends Tractor{
    public Tracked(String vehicleName, int speedCurrentTimePeriod) {
        super(vehicleName, speedCurrentTimePeriod);
    }

    @Override
    public void getSpeedVehicle() {
        System.out.println("Tracked Tracked Tractor speed: " + getSpeedCurrentTimePeriod());
    }

    @Override
    public void getWeightVehicle() {
        System.out.println("Tracked Tractor weight: 1500");
    }

    @Override
    public void getAmountOfPassangers() {
        System.out.println("Tracked Tractor Amount of passangers: 1");
    }

    @Override
    public void getAmountOfWheels() {
        System.out.println("Tracked Tractor amount wheels: 5");
    }
}
