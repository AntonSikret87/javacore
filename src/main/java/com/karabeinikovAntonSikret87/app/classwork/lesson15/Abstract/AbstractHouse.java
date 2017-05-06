package com.karabeinikovAntonSikret87.app.classwork.lesson15.Abstract;

/**
 * Created by AntonKa on 5/5/2017.
 */
public abstract class AbstractHouse { //не строгий(полустроги) контракт, потому что есть и абстрактный метод и не абстрактный
     private String name;

    public AbstractHouse(String name) {
        this.name = name;   }

    abstract void build();

    public void showHouseNumber(String number){
        System.out.println("Number " + number);
    }
}
