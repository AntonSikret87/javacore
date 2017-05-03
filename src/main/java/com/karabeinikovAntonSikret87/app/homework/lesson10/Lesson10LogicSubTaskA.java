package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AntonKa on 4/26/2017.
 */
public class Lesson10LogicSubTaskA {
    Scanner keyboard = new Scanner(System.in);
    String input = keyboard.next();
    String[] strArray = input.split(",");

    int[] intArray = new int[strArray.length];
    int[] intArr = strArrayToIntArray(strArray);


    public int[] strArrayToIntArray(String[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        return b;
    }

    public void bublAscend(int[] array) {
        int i,j,temp;
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
    public void bublDescend(int[] array) {
        int i,j,temp;
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

    public void howToSortArr() {
        System.out.println("Sort integers (Ascending or Descending, Enter: 'A' or 'D')");

        char letter = keyboard.next().charAt(0);
        switch(Character.toUpperCase(letter)) {
            case 'A':
                bublAscend(intArr);
                break;
            case 'D':
                bublDescend(intArr);
                break;
        }
    }

    public void enterValuesToArr() {
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
    }
}


