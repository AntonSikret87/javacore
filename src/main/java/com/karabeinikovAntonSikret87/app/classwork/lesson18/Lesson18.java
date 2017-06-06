package com.karabeinikovAntonSikret87.app.classwork.lesson18;

import com.karabeinikovAntonSikret87.app.classwork.lesson4.Car;

import java.util.Objects;

/**
 * Created by AntonKa on 5/23/2017.
 */
public class Lesson18 {
    public static void main(String[] args) {
        String name1 = new String("Anton");
        String name2 =  new String("Anton");

        String name3 = "Vika";
        String name4 = "Vika";

        String n1 = "Ant";
        String n2 = "on";
        String name5 = n1 + n2;



        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name5));
        System.out.println(name1 == name2);
        System.out.println(name1 == name5);

        System.out.println(name3.equals(name4));
        System.out.println(name3 == name4);

        System.out.println(name1.compareTo(name2));
        System.out.println(name3.compareTo(name4));


        Car car =  new  Car();
        Object object =  (Object)car; //upcasting
        car = (Car)object;//downcasting
        //new тогда создаётся объект

    }
}
