package com.karabeinikovAntonSikret87.app.homework.lesson15.Task2;

/**
 * Created by AntonKa on 5/12/2017.
 */
public class RunnerHouse {
    public static void main(String[] args) {
        String firstOwnerFlat = "VikaKa";

        Flat flat1 = new Flat(firstOwnerFlat);
        flat1.setNamberFlat(3);
        flat1.setNameWhoLivesInFlat("AntonKa");

        House house = new House(flat1); //композиция
        house.setFloorNumber(5);
        house.setNumberOfTheHouse(98);

        Bed bed = new Bed();
        bed.setBedMaterials("wood");
        bed.setBedModel("AT1G1000");

        flat1.setBed(bed); //агрегация
        System.out.println(house);
        System.out.println(flat1);
        System.out.println(bed);

    }
}
