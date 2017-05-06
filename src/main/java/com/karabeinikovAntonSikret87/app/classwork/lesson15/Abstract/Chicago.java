package com.karabeinikovAntonSikret87.app.classwork.lesson15.Abstract;

/**
 * Created by AntonKa on 5/5/2017.
 */
public class Chicago extends AbstractHouse {
    public Chicago(String name) {
        super(name);
    }

    @Override
    void build() {
        System.out.println("Build CHicago House");
        showHouseNumber("137");
    }
}
