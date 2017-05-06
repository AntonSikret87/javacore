package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.Scanner;

/**
 * Created by AntonKa on 5/6/2017.
 */
public class Lesson10LogicSubTaskC {
    public void replaceKeywordToSpace(String line, String keyWord) {
        line = line.replace(keyWord, "");
        System.out.print("Line without keyword: " + line);
    }

    public String giveKeyWord(Scanner in) {
        System.out.print("Please give me a keyword(which will be hidden from output): ");
        return in.next();
    }

    public String giveSentence(Scanner in) {
        System.out.print("Please give any sentence: ");
        return in.nextLine();
    }
}
