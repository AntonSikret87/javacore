package com.karabeinikovAntonSikret87.app.classwork.lesson16.interfaces;

/**
 * Created by AntonKa on 5/12/2017.
 */
public class RunnerBicycle {
    public static void main(String[] args) {
       Bicycle bicycle  = new ACMEBicycle();
       bicycle.changeGear(20);
       bicycle.showSpeed();

       ACMEBicycle acmeBicycle = new ACMEBicycle();
       acmeBicycle.printState();
       acmeBicycle.useEcoItems();
       acmeBicycle.clean();
       System.out.println(acmeBicycle);

       PartsStandart partsStandart =  new ACMEBicycle();
       partsStandart.useEcoItems();

       Maintanance maintanance = new ACMEBicycle();
       maintanance.clean();

    }
}
