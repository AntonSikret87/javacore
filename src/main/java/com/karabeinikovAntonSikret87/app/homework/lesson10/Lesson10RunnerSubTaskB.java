package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.Scanner;

/**
 * Created by AntonKa on 5/6/2017.
 */
public class Lesson10RunnerSubTaskB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String isUpAndLow = "";
        Lesson10LogicSubTaskB lesson10LogicSubTaskB = new Lesson10LogicSubTaskB();
        String line = lesson10LogicSubTaskB.giveValue(in);
        String delimeter = lesson10LogicSubTaskB.giveDelimeter(in);
        isUpAndLow = lesson10LogicSubTaskB.searchUpLowCharAndSeparateByDelimeter(isUpAndLow, line, delimeter);
        System.out.println("The uppercase and lowercase characters were: " + isUpAndLow);
    }
}



