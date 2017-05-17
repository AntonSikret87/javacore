package com.karabeinikovAntonSikret87.app.homework.lesson16;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class TransportRunner {
    public static void main(String[] args) {
        Tractor tractor = new Tractor("Belorus1", 0);
        tractor.setSpeedCurrentTimePeriod(30);
        tractor.printTransportName();
        tractor.getSpeedVehicle();

        Tractor trackedTractor = new Tracked("TrackedBelorus2",0);
        trackedTractor.setSpeedCurrentTimePeriod(50);
        trackedTractor.printTransportName();
        trackedTractor.getAmountOfPassangers();
        trackedTractor.getAmountOfWheels();
        trackedTractor.getSpeedVehicle();
        trackedTractor.getWeightVehicle();

        Tractor wheeledTractor = new Wheeled("WhiledTractor2",1);
        wheeledTractor.setSpeedCurrentTimePeriod(100);
        wheeledTractor.printTransportName();
        wheeledTractor.getAmountOfPassangers();
        wheeledTractor.getAmountOfWheels();
        wheeledTractor.getSpeedVehicle();
        wheeledTractor.getWeightVehicle();



    }
}
