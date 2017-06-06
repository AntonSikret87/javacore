package com.karabeinikovAntonSikret87.app.classwork.lesson20.ClassWorkGenerics;

import com.karabeinikovAntonSikret87.app.classwork.lesson20.Generic.OrderUtil;

/**
 * Created by AntonKa on 5/30/2017.
 */
public class CompareRunner {
    public static void main(String[] args) {
        Compare<String> objS1 = new CompareData("Anton");
        Compare<String> objS2 = new CompareData("Anton");

        Compare<Integer> objI1 = new CompareData(22);
        Compare<Integer> objI2 = new CompareData(33);

        boolean compareStrings = OrderUtil.compare(objS1, objS2);
        System.out.println(compareStrings);

        boolean compareInt = OrderUtil.compare(objI1, objI2);
        System.out.println(compareInt);

    }
}
