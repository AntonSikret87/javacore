package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.carOverwriting;

/**
 * Created by AntonKa on 4/25/2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.carDrive();
        System.out.println(bmw.nameCar);

        Audi audi = new Audi();
        audi.carDrive();
        System.out.println(audi.nameCar);
    }
}
