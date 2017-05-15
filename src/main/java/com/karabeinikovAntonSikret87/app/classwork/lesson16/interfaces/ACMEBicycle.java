package com.karabeinikovAntonSikret87.app.classwork.lesson16.interfaces;

/**
 * Created by AntonKa on 5/12/2017.
 */
public class ACMEBicycle implements Bicycle, PartsStandart,Maintanance {


    private int cadence = 2;
    private int gear = 10;
    private  int speed = 80;

    @Override
    public String toString() {
        return "ACMEBicycle{" +
                "cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void changeGear(int newValue) {
        this.cadence = newValue;
    }

    @Override
    public void changeCadence(int newValue) {
        this.gear = newValue;
    }

    public void printState(){
        System.out.println("Speed is: " + speed);
    }

    @Override
    public void useEcoItems() {
        System.out.println("Created with Eco items");
    }

    @Override
    public void clean() {
        System.out.println("Cleane bicycle");
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
