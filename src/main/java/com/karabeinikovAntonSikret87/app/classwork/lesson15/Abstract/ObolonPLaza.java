package com.karabeinikovAntonSikret87.app.classwork.lesson15.Abstract;

/**
 * Created by AntonKa on 5/5/2017.
 */
public class ObolonPLaza extends AbstractHouse {
    public ObolonPLaza(String name) {
        super(name);
    }

    @Override
    void build() {
        System.out.println("Build ObolonPlaza House");
        showHouseNumber("831");
    }
}
