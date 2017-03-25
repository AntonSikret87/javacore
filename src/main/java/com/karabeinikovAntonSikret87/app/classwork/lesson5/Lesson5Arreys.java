package com.karabeinikovAntonSikret87.app.classwork.lesson5;

/**
 * Created by AntonKa on 3/24/2017.
 */
public class Lesson5Arreys {

    public void buysToGirls() {
        String[] boysName = {"Anton", "Fransua", "Janpol'"};

        for (String boysNamePos : boysName) {
            System.out.println(boysNamePos);
        }
        boysName[0] = "Vika";
        boysName[1] = "Lena";
        boysName[2] = "Sveta";

        for (String boysToGirlsPos : boysName) {
            System.out.println(boysToGirlsPos);
        }
    }

    public void girls() {
        String[] boysName = new String[3];
        boysName[0] = "Vika";
        boysName[1] = "Lena";
        boysName[2] = "Sveta";

        System.out.println(boysName[0]);
        System.out.println(boysName[1]);
        System.out.println(boysName[2]);

    }

    public void numbers1() {

        int[] arreyInt = new int[3];
        arreyInt[0] = 2;
        arreyInt[1] = 4;
        arreyInt[2] = 6;

        System.out.println(arreyInt);
        for (int arrayPosition : arreyInt) {
            System.out.println(arrayPosition);
        }

    }
    public void numbers2() {
        int[] arreyInt = {3, 6 ,9};
        for (int arrayPosition : arreyInt) {
            System.out.println(arrayPosition);
        }
        System.out.println("lenght array is : " + arreyInt.length);
    }
}
