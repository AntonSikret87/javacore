package com.karabeinikovAntonSikret87.app.homework.lesson15.Task2;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class Bed {
    private String bedModel;
    private String bedMaterials;

    public String getBedModel() {
        return bedModel;
    }

    public void setBedModel(String bedModel) {
        this.bedModel = bedModel;
    }

    public String getBedMaterials() {
        return bedMaterials;
    }

    public void setBedMaterials(String bedMaterials) {
        this.bedMaterials = bedMaterials;
    }


    @Override
    public String toString() {
        return "Bed{" +
                "bedModel='" + bedModel + '\'' +
                ", bedMaterials='" + bedMaterials + '\'' +
                '}';
    }
}
