package com.karabeinikovAntonSikret87.app.classwork.lesson4;

/**
 * Created by AntonKa on 3/17/2017.
 */
public class Car {
    public static final double PI = 3.14d;
    public String name;
    public static int wheelsCounter = 4;
    public static int doorsCounter = 3;

    public static void driver(){
        System.out.println("Drive the car");
    }
    public static void speed(int a){
        System.out.println("Speed is " + a);
    }
    public static int addDoorsAndWheels(int a, int b){
        int result = a + b;
        System.out.println("Doors and wheels are: " + result);
        return result;
    }

}
