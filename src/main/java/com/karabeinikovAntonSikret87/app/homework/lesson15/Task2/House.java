package com.karabeinikovAntonSikret87.app.homework.lesson15.Task2;

/**
 * Created by AntonKa on 5/12/2017.
 */
public class House {
    private int numberOfTheHouse;
    private int floorNumber;
    private Flat flat;
    private Bed bed;


    public House(Flat flat) {
        this.flat = flat;
    }

    public int getNumberOfTheHouse() {
        return numberOfTheHouse;
    }

    public void setNumberOfTheHouse(int numberOfTheHouse) {
        this.numberOfTheHouse = numberOfTheHouse;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfTheHouse=" + numberOfTheHouse +
                ", floorNumber=" + floorNumber +
                ", flat=" + flat +
                ", bed=" + bed +
                '}';
    }
}
