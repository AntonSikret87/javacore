package com.karabeinikovAntonSikret87.app.classwork.lesson8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AntonKa on 3/31/2017.
 */

public class Lesson8 {

    static int[] arr = {16, 15, 8, 2};
    static int counterInt = 105;
    static double counterDouble = 102.33;
    static boolean boolCounter = true;
    static long counterLong = 103l;

    public static void main(String[] args) {
        //scanCase();
        //arrayBubbleSortAscending();
//        charToString();
//        charToStringVolume2();
        // convertFromOtherToStringAndBack();
        //concatenationStrings();
        //compareStrings();
        polindromeString();
    }

    private static void scanCase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to me: ");
        int enteredInt = sc.nextInt();
        switch (enteredInt) {
            case 1:
                System.out.println("First number is: " + enteredInt);
                break;
            case 2:
                System.out.println("Second number is: " + enteredInt);
                break;
            case 3:
                System.out.println("Third number is: " + enteredInt);
                break;
            default:
                System.out.println("Other number is: " + enteredInt);
        }
    }

    public static void arrayBubbleSortAscending() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void charToString() {
        String stringToDisplay = "";
        char[] charArrToString = {'a', 'n', 't', 'o', 'n'};

        for (int i = 0; i < charArrToString.length; i++) {
            stringToDisplay += charArrToString[i];
        }
        String myName = stringToDisplay.substring(0, 1).toUpperCase() + stringToDisplay.substring(1).toLowerCase();
        System.out.println("First volume myName to print: " + myName);
    }

    public static void charToStringVolume2() {
        String stringToDisplay = "";
        char[] charArrToString = {'a', 'n', 't', 'o', 'n'};

        stringToDisplay = Arrays.toString(charArrToString)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .replace("a", "A")
                .trim();
        System.out.println("Second volume myName to print: " + stringToDisplay);
    }

    public static void convertFromOtherToStringAndBack() {
        //convert to string
        String counterIntToString = String.valueOf(counterInt);
        System.out.println("String int: " + counterIntToString);

        String counterDoubleToString = String.valueOf(counterDouble);
        System.out.println("String double: " + counterDoubleToString);

        String counterBoolToString = String.valueOf(boolCounter);
        String myBool = counterBoolToString.substring(0, 1).toUpperCase() + counterBoolToString.substring(1).toLowerCase();
        System.out.println("String bool: " + myBool);

        String counterLongToString = String.valueOf(counterLong);
        System.out.println("String bool: " + counterLongToString);

        //convert from string
        Integer backToIntFromString = Integer.valueOf(counterIntToString);
        System.out.println("From String to int: " + backToIntFromString);

        Double backToDoubleFromString = Double.valueOf(counterDoubleToString);
        System.out.println("From String to double: " + backToDoubleFromString);

        Boolean backToBoolFromString = Boolean.valueOf(myBool);
        System.out.println("From String to boolean: " + backToBoolFromString);

        Long backToLongFromString = Long.valueOf(counterLongToString);
        System.out.println("From String to long: " + backToLongFromString);
    }

    public static void concatenationStrings() {
        String s1 = "first string";
        String s2 = " and second string";
        s1 = s1 + s2;
        System.out.println("Concat string example: " + s1);
        String s3 = "1";
        String s4 = " and 2";
        s3 = s3.concat(s4);
        System.out.println("Another concat string example: " + s3);
    }

    public static void compareStrings() {
        String myName1 = "Anton";
        String myName2 = "Anton";
        if (myName1 == myName2) {
            System.out.println("Names are equals");
        }
        String notMyName1 = "Alladin";
        String notMyName2 = "Alladin";
        if (notMyName1.equals(notMyName2)) {
            System.out.println("Names are equals");
        }
    }

    public static void polindromeString() {
        String palindrome = "mfom";

        boolean isPalindrome = true;

        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome &&(palindrome.charAt(i) ==
                    palindrome.charAt(palindrome.length() - i - 1));
        }
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
