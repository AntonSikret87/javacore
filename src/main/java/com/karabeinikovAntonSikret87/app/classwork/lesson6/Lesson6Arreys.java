package com.karabeinikovAntonSikret87.app.classwork.lesson6;

import java.util.Arrays;

/**
 * Created by AntonKa on 3/24/2017.
 */
public class Lesson6Arreys {

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
    public void twoDimArr() {
        int[][] arreyInt = new int[3][4];
        arreyInt[0][0] = 25;
        arreyInt[1][2] = 50;
        arreyInt[0][2] = 10;
        System.out.println(arreyInt[0][0] + " " + arreyInt[0][1] + arreyInt[1][2] + arreyInt[0][2]);
    }
    public void intArr() {
        int[] intArray = {10, 20, 30};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public void intArrToString() {
        int[] intArray = {10, 20, 30};
        System.out.println(Arrays.toString(intArray));
    }


    public void twoDimArrJandK() {
        int[][] intArray = new int[2][3];
        for(int j=0; j<intArray.length;j++){
            for(int k=0;k<intArray[j].length;k++) {
                intArray[j][k] = j * k;
                System.out.print(intArray[j][k] + ", ");
            }
        }
    }
}
