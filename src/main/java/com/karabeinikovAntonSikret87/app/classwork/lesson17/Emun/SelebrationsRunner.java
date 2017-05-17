package com.karabeinikovAntonSikret87.app.classwork.lesson17.Emun;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class SelebrationsRunner {
    public static void main(String[] args) {
        for(Selebrations cName: Selebrations.values()) {
            System.out.println(cName.getEvent()+ " is on " + cName.getMonth() + ", " + cName.getNumberDay());
        }
    }
}
