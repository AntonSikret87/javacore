package com.karabeinikovAntonSikret87.app.classwork.lesson12;

/**
 * Created by AntonKa on 4/21/2017.
 */
public class Lesson12BicycleRunner {
    public static void main(String[] args) {
        int wheelSizeBicycle = 5;
        String colorBicycle = "Green";
        int speed = 25;
        double price = 9.0;

        String color = "red";
        Bicycle bicycle = new Bicycle(color);
        bicycle.color = "Red";
        System.out.println(bicycle.color);

        Bicycle bicycle1 =  new Bicycle(4,6,"Blue");
        System.out.println(bicycle1.color + " " +  bicycle1.speed + " " + bicycle1.wheeelSize);

        Bicycle bicycle2 =  new Bicycle(wheelSizeBicycle, speed, colorBicycle);
        System.out.println(bicycle2.color + " " + bicycle2.speed+ " " + bicycle2.wheeelSize);

        Bicycle bicycle3 = new Bicycle();
        System.out.println(bicycle3.color);

        Bicycle bicycle4 =  new Bicycle(wheelSizeBicycle, speed, colorBicycle, price);
        System.out.println("Color: " + bicycle4.color + "; "
                + "Speed: " + bicycle4.speed+ "; "
                + "Wheelsize: " + bicycle4.wheeelSize + "; "
                + "Price: " + bicycle4.price);
    }
}
