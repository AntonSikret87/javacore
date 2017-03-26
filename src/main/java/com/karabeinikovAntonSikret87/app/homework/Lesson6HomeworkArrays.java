package com.karabeinikovAntonSikret87.app.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

/**
 * Created by AntonKa on 3/25/2017.
 */
public class Lesson6HomeworkArrays {
    int[] arreyEvenIntFromTwoToTwenty = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int[] arreyOddIntFromOneToNineNine = new int[99];
    int[] arrayFifteen = new int[15];
    public int countEven = 0;

    public void intArrayFromTwoToTwentyInLine() {
        System.out.println(" ");
        for (int arrayPosition : arreyEvenIntFromTwoToTwenty) {
            System.out.println(arrayPosition);
        }
    }

    public void intArrayFromTwoToTwentyInRow() {
        for (int arrayPosition : arreyEvenIntFromTwoToTwenty) {
            System.out.print(arrayPosition + " ");
        }
    }

    public void printArreyFrom1to99() {
        for (int a = 0; a < arreyOddIntFromOneToNineNine.length; a++) {
            arreyOddIntFromOneToNineNine[a] = (a + 1);
            int arr = 0;
            if (arreyOddIntFromOneToNineNine[a] % 2 == 1) {
                arr = arreyOddIntFromOneToNineNine[a];
                System.out.print(arr + " ");
            }
        }
        System.out.println(" ");
    }

    public void printArreyFrom99to1() {
        System.out.print(arreyOddIntFromOneToNineNine.length + " ");
        for (int i = arreyOddIntFromOneToNineNine.length - 1; i >= 0; i--) {
            arreyOddIntFromOneToNineNine[i] = (i - 1);
            if (arreyOddIntFromOneToNineNine[i] % 2 == 1) {
                System.out.print(arreyOddIntFromOneToNineNine[i] + " ");
            }
        }
    }

    public void printRandomValAndPrintEven() {
        int i;
        for (i = 0; i < arrayFifteen.length; i++) {
            arrayFifteen[i] = (int) (Math.random() * 10);
            System.out.println("  ");
            System.out.print(i + ". " + arrayFifteen[i] + "  ");
            if (arrayFifteen[i] % 2 == 0) {
                System.out.print("Even number " + arrayFifteen[i] + "  ");
                countEven++;
            }
        }
        System.out.println("  ");
        System.out.println("Total Enen numbers is " + countEven);
        System.out.println("Array 15 numbers (Range is 0-9): " + arrayFifteen.length);
        System.out.print("Random values are: ");
        for (int allRandVal : arrayFifteen) {
            System.out.print(allRandVal + ", ");
        }
    }

    public void printRandomValAndPrintMaxAndMin() {
        int i;
        for (i = 0; i < arrayFifteen.length; i++) {
            arrayFifteen[i] = (int) (Math.random() * 1000);
        }
        for (int allRandVal : arrayFifteen) {
            System.out.print(allRandVal + ", ");
        }
        List b = Arrays.asList(ArrayUtils.toObject(arrayFifteen));
        System.out.println(" ");
        System.out.println("The minimum in the arr: " + Collections.min(b));
        System.out.println("The maximum in the arr: " + Collections.max(b));
//First Try, but 0 was allways minimum!!
//        for(int ii = 0;ii < arrayFifteen.length; ii++){
//            if(arrayFifteen[ii] < min){
//                min=arrayFifteen[ii];
//            }
//            else if(arrayFifteen[ii] > max){
//                max=arrayFifteen[ii];
//            }
//        }
//        System.out.println(" ");
//        System.out.println("The minimum in the arr: " + min);
//        System.out.println("The maximum in the arr: " + max);
    }

    public void printRandomTwoDimensionalArray() {
        int[][] twoDimensionArray = new int[8][5];
        for (int a = 0; a < twoDimensionArray.length; a++) {
            for (int b = 0; b < twoDimensionArray[a].length; b++) {
                twoDimensionArray[a][b] = (int) (10 + (Math.random() * 90));
                System.out.print(twoDimensionArray[a][b] + ", ");
            }
        }
        System.out.println("- Two dimension random (10-99)array with 8 rows and 5 colomns(8*5=40 values).");
    }
}

