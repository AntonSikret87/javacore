package com.karabeinikovAntonSikret87.app.homework.lesson16;

/**
 * Created by AntonKa on 5/16/2017.
 */
public abstract class Machine implements Run {
    public final static int MAX_SPEED = 300;
    public final static int MIN_SPEED = 5;
    public final static int MAX_AMOUNT_PASSENGERS = 80;
    public final static int MIN_AMOUNT_PASSENGERS = 0;
    private String vehicleName;
    private int speedCurrentTimePeriod;

    public Machine(String vehicleName, int speedCurrentTimePeriod) {
        this.vehicleName = vehicleName;
        this.speedCurrentTimePeriod = speedCurrentTimePeriod;
    }

    @Override
    public void printTransportName() {
        System.out.println("Transport name is: " + vehicleName);
    }

    public abstract void getSpeedVehicle();

    public abstract void getWeightVehicle();

    public abstract void getAmountOfPassangers();

    public abstract void getAmountOfWheels();

    public static int getMaxSpeed() {
        return MAX_SPEED;
    }

    public static int getMinSpeed() {
        return MIN_SPEED;
    }

    public static int getMaxAmountPassengers() {
        return MAX_AMOUNT_PASSENGERS;
    }

    public static int getMinAmountPassengers() {
        return MIN_AMOUNT_PASSENGERS;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getSpeedCurrentTimePeriod() {
        return speedCurrentTimePeriod;
    }

    public void setSpeedCurrentTimePeriod(int speedCurrentTimePeriod) {
        this.speedCurrentTimePeriod = speedCurrentTimePeriod;
    }

}
