package com.karabeinikovAntonSikret87.app.classwork.lesson15;

/**
 * Created by AntonKa on 5/5/2017.
 */
public class Car {

    private Engine engine;
    private Navigation navigation;
    private Wheels wheels;
    private MultimediaSystem multimediaSystem;

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }


    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public MultimediaSystem getMultimediaSystem() {
        return multimediaSystem;
    }

    public void setMultimediaSystem(MultimediaSystem multimediaSystem) {
        this.multimediaSystem = multimediaSystem;
    }
}
