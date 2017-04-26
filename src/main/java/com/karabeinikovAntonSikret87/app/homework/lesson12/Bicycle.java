package com.karabeinikovAntonSikret87.app.homework.lesson12;

/**
 * Created by AntonKa on 4/26/2017.
 */
abstract public class Bicycle {

    public void ride(){
        System.out.println("Wroom!");
    }
    abstract public void setSpeed(int speed);

    abstract public void setGear(int gear);

}
