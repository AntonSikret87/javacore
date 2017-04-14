package com.karabeinikovAntonSikret87.app.homework.lesson11;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by AntonKa on 4/13/2017.
 */
public class PolindromInOutRunnerLesson11 {

    public static ArrayList<String> arrayInputStrings = new ArrayList<String>();


    public static void main(String[] args) throws IOException {
        PolindromeLogicLesson11 polindromeLogicLesson11 = new PolindromeLogicLesson11();
        polindromeLogicLesson11.readPolindromeFromFile();
        polindromeLogicLesson11.writePolindromeToFile(arrayInputStrings);
    }
}
