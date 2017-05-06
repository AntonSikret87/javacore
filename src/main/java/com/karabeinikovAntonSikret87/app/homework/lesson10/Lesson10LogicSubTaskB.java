package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.Scanner;

/**
 * Created by AntonKa on 5/6/2017.
 */
public class Lesson10LogicSubTaskB {
    public String searchUpLowCharAndSeparateByDelimeter(String isUpAndLow, String line, String delimeter) {
        int lineLength = line.length();
        for (int y = 0; y < lineLength; y++) {
            if (Character.isUpperCase(line.charAt(y)) || Character.isLowerCase(line.charAt(y))) {
                char w = line.charAt(y);
                isUpAndLow = isUpAndLow + w + delimeter;
            }
        }
        return isUpAndLow;
    }

    public String giveDelimeter(Scanner in) {
        System.out.print("Please give a delimeter to separate your characters: ");
        return in.next();
    }

    public String giveValue(Scanner in) {
        System.out.print("Please give any value to find only UpandLow letters: ");
        return in.next();
    }
}


