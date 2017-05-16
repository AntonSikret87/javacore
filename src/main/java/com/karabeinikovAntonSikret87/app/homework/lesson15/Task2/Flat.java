package com.karabeinikovAntonSikret87.app.homework.lesson15.Task2;

/**
 * Created by AntonKa on 5/12/2017.
 */
public class Flat {
    private int countOfFlat;
    private String nameWhoLivesInFlat;
    private Bed bed;

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }



    public Flat(String nameWhoLivesInFlat) {
        this.nameWhoLivesInFlat = nameWhoLivesInFlat;
    }

    public int getNamberFlat() {
        return countOfFlat;
    }

    public void setNamberFlat(int namberFlat) {
        this.countOfFlat = namberFlat;
    }

    public String getNameWhoLivesInFlat() {
        return nameWhoLivesInFlat;
    }

    public void setNameWhoLivesInFlat(String nameWhoLivesInFlat) {
        this.nameWhoLivesInFlat = nameWhoLivesInFlat;
    }


    @Override
    public String toString() {
        return "Flat{" +
                "countOfFlat=" + countOfFlat +
                ", nameWhoLivesInFlat='" + nameWhoLivesInFlat + '\'' +
                ", bed=" + bed +
                '}';
    }
}
