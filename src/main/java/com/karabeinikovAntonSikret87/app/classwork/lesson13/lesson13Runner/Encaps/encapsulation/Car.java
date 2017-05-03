package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.Encaps.encapsulation;

/**
 * Created by AntonKa on 4/28/2017.
 */
public class Car {


    private String carName = "car";

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void shiftCarGear(){
        System.out.println(carName);
    }


}
