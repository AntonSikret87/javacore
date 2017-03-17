package com.karabeinikovAntonSikret87.app.classwork.lesson3;

/**
 * Created by AntonKa on 3/15/2017.
 */
public class MathFunc {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public String addThreeStrings(String a, String b, String c) {
        return a + b + c;
    }

    public String testMessage(String a) {
        return a;
    }

    public char floatToChar(float floatValue) {
        char newCharValueFromFloat = (char) floatValue;
        return newCharValueFromFloat;
    }

    public char intToChar(int intValue) {
        char newCharValueFromInt = (char) intValue;
        return newCharValueFromInt;
    }

    public int charToInt(char charValue) {
        int newIntValueFromChar = (int) charValue;
        return newIntValueFromChar;
    }

    public int doubleToInt(double doubleValue) {
        int newIntValueFromInt = (int) doubleValue;
        return newIntValueFromInt;
    }

    public String concat(boolean append, String a, String b) {
        String result = null;
        if (append) {
            result = a + b;
        }
        return result.toUpperCase();
    }

    public Boolean isOdd(int a) {
        if (a % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfInts(int a, int b) {
        int maxInt = Math.max(a, b);
        return maxInt;
    }

    public int minOfInts(int a, int b) {
        int maxInt = Math.min(a, b);
        return maxInt;
    }

    public int increace(int a) {
        a++;
        return a;
    }

    public int decreace(int a) {
        a--;
        return a;
    }
    public int changeYear(int year) {
        if (year != 2017) {
            year = 2017;
        } else {
            System.out.println("Allready 2017");
        }
        return year;
    }
    public int strLenght(String text) {
        int strLeng = text.length();
        return strLeng;
    }
    public double sqrtOfDoubleToInt(double a) {
        double sqrtDouble = Math.sqrt(a);
        return sqrtDouble;
    }
    public int negativeToPositive(int a) {
        int negativeDouble = Math.abs(a);
        return negativeDouble;
    }
}

