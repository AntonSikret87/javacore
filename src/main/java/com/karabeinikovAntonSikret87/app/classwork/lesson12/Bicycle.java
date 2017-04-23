package com.karabeinikovAntonSikret87.app.classwork.lesson12;

/**
 * Created by AntonKa on 4/21/2017.
 */
public class Bicycle {
    String color;
    int wheeelSize;
    int speed;
    double price;


    public Bicycle() {
        color = "Black Dots";
    }
    public Bicycle(String color) {
        this.color = color;
    }

    public Bicycle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public Bicycle(int wheeelSize, int speed, String color) {
        this(color,speed);
        this.wheeelSize = wheeelSize;
    }
    public Bicycle(int wheeelSize, int speed, String color , double price) {
        this(wheeelSize,speed,color);
        this.price =price;
    }
}
