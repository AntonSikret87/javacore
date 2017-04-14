package com.karabeinikovAntonSikret87.app.homework.lesson8;

import java.util.Arrays;

/**
 * Created by AntonKa on 4/3/2017.
 */
public class Lesson8HomeWork {

    public static int i, j, temp;



    public static void bublAscend(int[] array) {
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted accending list of integers:");
        System.out.println(Arrays.toString(array));
    }

    public static void bublDescend(int[] array) {

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted descending list of integers:");
        System.out.println(Arrays.toString(array));
    }
}



