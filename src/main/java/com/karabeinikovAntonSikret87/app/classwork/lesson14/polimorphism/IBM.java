package com.karabeinikovAntonSikret87.app.classwork.lesson14.polimorphism;

/**
 * Created by AntonKa on 4/28/2017.
 */
public class IBM extends Computer {
    public void changeRAM(){
        System.out.println("Change IBM RAM memory");
    }
    public void changeSSD(){
        System.out.println("Change IBM SSD");
    }
    public void changeOnlyFORIBM(){
        System.out.println("Changes ONLY for IBM");
    }
    public void changeCPU(){
        System.out.println("Change IBM CPU");
    }
}
