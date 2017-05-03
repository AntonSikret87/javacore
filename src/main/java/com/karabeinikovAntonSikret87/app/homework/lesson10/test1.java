package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AntonKa on 4/26/2017.
 */
public class test1 {
    public static void main(String[] args) {


        String input;

        System.out.println("Please enter integers, use comma to separate: ");
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.next();


        String[] strArray = input.split(",");

        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        //howToSortArr(keyboard, strArray);

//        System.out.println("Entered integers:  ");
//        for (String s : strArray) {
//            System.out.print(s + ", ");
//        }
//
//        int[] intArr = strArrayToIntArray(strArray);
//        System.out.println(" ");
//
//        bublAscend(intArr);
//        bublDescend(intArr);

    }

    public static void howToSortArr(Scanner keyboard, String[] strArray) {
        System.out.println("Sort integers (Ascending or Descending, Enter: 'A' or 'D')");
        int[] intArr = strArrayToIntArray(strArray);
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

    public static int[] strArrayToIntArray(String[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        return b;
    }

    public static void bublAscend(int[] array) {
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
    public static void bublDescend(int[] array) {
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
}
