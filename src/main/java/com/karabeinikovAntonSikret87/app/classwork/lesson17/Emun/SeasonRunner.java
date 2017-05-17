package com.karabeinikovAntonSikret87.app.classwork.lesson17.Emun;

import java.util.Arrays;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class SeasonRunner {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
        if(season ==  Season.SPRING){
            season = Season.SUMMER;
        }
        System.out.println(season);
        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(Arrays.toString(Season.values()));

    }
}
