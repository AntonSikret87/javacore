package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.Scanner;

/**
 * Created by AntonKa on 5/6/2017.
 */
public class Lesson10RunnerSubTaskC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lesson10LogicSubTaskC lesson10LogicSubTaskC =  new Lesson10LogicSubTaskC();
        String line = lesson10LogicSubTaskC.giveSentence(in);
        String keyWord = lesson10LogicSubTaskC.giveKeyWord(in);
        lesson10LogicSubTaskC.replaceKeywordToSpace(line, keyWord);
    }
}
