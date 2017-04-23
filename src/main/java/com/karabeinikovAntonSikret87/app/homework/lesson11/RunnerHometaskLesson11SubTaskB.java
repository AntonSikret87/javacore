package com.karabeinikovAntonSikret87.app.homework.lesson11;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by AntonKa on 4/24/2017.
 */
public class RunnerHometaskLesson11SubTaskB {
    public static ArrayList<String> arrayInputStrings = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        //HomeWork Lesson11 Sub-Task b
        PolindromeLogicLesson11 polindromeLogicLesson11 = new PolindromeLogicLesson11();
        polindromeLogicLesson11.readPolindromeFromFile();
        polindromeLogicLesson11.writePolindromeToFile(arrayInputStrings);
    }
}