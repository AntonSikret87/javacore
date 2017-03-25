package com.karabeinikovAntonSikret87.app.homework;

/**
 * Created by AntonKa on 3/25/2017.
 */
public class Lesson5HomeworkArrays {

    int[] arreyEvenIntFromTwoToTwenty = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int[] arreyOddIntFromOneToNineNine = new int[99];
    int[] arrayFifteen = new int[16];

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
        for (int i = 1; i < arrayFifteen.length; i++) {
            arrayFifteen[i] = (int) (Math.random() * 10);
            System.out.print(i + ". " + arrayFifteen[i] + "  ");
            if (arrayFifteen[i] % 2 == 0) {
                System.out.print("Even random number " + arrayFifteen[i] + "  ");
            }
            System.out.println("  ");
        }
    }
}

