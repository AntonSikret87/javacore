package com.karabeinikovAntonSikret87.runners.homework;

import com.karabeinikovAntonSikret87.app.utils.convertors.PrimitiveConvertor;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.PrintStream;
import java.util.Scanner;

import static com.karabeinikovAntonSikret87.runners.homework.Lesson4ScanMethods.whatAppDo;
import static com.karabeinikovAntonSikret87.runners.homework.Lesson4ScanMethods.whatNeedToBeEnter;

/**
 * Created by AntonKa on 3/18/2017.
 */
public class Lesson4Runner {



    public static void main(String[] args) {

        Lesson4ScanMethods.appExplenation(whatAppDo);
        Lesson4ScanMethods.appExplenation(whatNeedToBeEnter);
        Lesson4ScanMethods.scanNum();

    }


}
