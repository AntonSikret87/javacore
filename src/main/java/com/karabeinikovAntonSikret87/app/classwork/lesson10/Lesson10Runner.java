package com.karabeinikovAntonSikret87.app.classwork.lesson10;

import java.util.Scanner;

/**
 * Created by AntonKa on 4/11/2017.
 */
public class Lesson10Runner {


    public static void main(String[] args) {

        Lesson10CodedDecoded lesson10CodedDecoded = new Lesson10CodedDecoded();
        String line = lesson10CodedDecoded.scannerToMeSrtingToCode();
        String codedString = lesson10CodedDecoded.giveMeCodedString(line);
        lesson10CodedDecoded.giveMeDecodedString(codedString);

    }


}
