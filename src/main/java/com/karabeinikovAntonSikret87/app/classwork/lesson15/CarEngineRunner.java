package com.karabeinikovAntonSikret87.app.classwork.lesson15;

/**
 * Created by AntonKa on 5/5/2017.
 */
public class CarEngineRunner {
    public static void main(String[] args) {
        String engineName = "V8Turbo";
        String wheelsName = "Michelin";

        Wheels wheels = new Wheels(wheelsName);
        System.out.println("Wheels: " + wheels.getWheelsName());

        Engine engine = new Engine(engineName);
        Car car = new Car(engine, wheels);  //строгая композиция

        System.out.println("Car engine: " + car.getEngine().getEngineNAme());

        Navigation navigationGoogle = new Navigation();
        navigationGoogle.setNavigationName("GoogleNavigation");
        car.setNavigation(navigationGoogle); //не строгая композиция
        System.out.println("Car navigation1: " + car.getNavigation().getNavigationName());

        Navigation navigationGarmin = new Navigation();
        navigationGarmin.setNavigationName("GarminNavigation");
        car.setNavigation(navigationGarmin); //не строгая композиция
        System.out.println("Car navigation2: " + car.getNavigation().getNavigationName());

        MultimediaSystem multimediaSystem = new MultimediaSystem();
        multimediaSystem.setMultimediaName("SonyMusic");
        car.setMultimediaSystem(multimediaSystem); //не строгая композиция
        System.out.println("Car music system: " + car.getMultimediaSystem().getMultimediaName());


    }
}
