package com.karabeinikovAntonSikret87.app.homework.lesson14;

/**
 * Created by AntonKa on 4/26/2017.
 */
public class CustomBicycle extends Bicycle {
    int speed;
    int gear;


    @Override
    public void setSpeed(int speed) {
        this.speed =speed;
        System.out.println("Speed is: " + speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear is: " +  gear);
    }

    public void ride(){
        System.out.println("Wshhhh!");
    }
}
