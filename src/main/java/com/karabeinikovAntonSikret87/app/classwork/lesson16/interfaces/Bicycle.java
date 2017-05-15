package com.karabeinikovAntonSikret87.app.classwork.lesson16.interfaces;

/**
 * Created by AntonKa on 5/12/2017.
 */
public interface Bicycle {
    int WHEEL_SIZE = 10;

    void changeGear(int newValue);
    void changeCadence(int newValue);

    default void showSpeed(){
        System.out.println("Speed is 10");
    }
}
