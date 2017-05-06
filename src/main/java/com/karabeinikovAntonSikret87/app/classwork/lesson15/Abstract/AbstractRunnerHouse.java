package com.karabeinikovAntonSikret87.app.classwork.lesson15.Abstract;

/**
 * Created by AntonKa on 5/5/2017.
 */
public class AbstractRunnerHouse {
    public static void main(String[] args) {
        String nameChicago = "ChicagoHouse1";
        String nameObolonPlaza = "ObolonPlaza1";

        AbstractHouse chicago = new Chicago(nameChicago);
        chicago.build();
        chicago.showHouseNumber("12");


        AbstractHouse obolonPLaza = new ObolonPLaza(nameObolonPlaza);
        obolonPLaza.build();
        obolonPLaza.showHouseNumber("13");

        AbstractHouse abstractHouse1 = new AbstractHouse("AbstractHause1") {
            @Override
            void build() {
                System.out.println("AbstractHouse1");
            }
        };
        AbstractHouse abstractHouse2 = new AbstractHouse("AbstractHause2") {
            @Override
            void build() {
                System.out.println("AbstractHouse2");
            }
        };
    }
}
