package com.karabeinikovAntonSikret87.app.homework;

import com.karabeinikovAntonSikret87.app.utils.convertors.PrimitiveConvertor;

import java.util.Scanner;

/**
 * Created by AntonKa on 3/21/2017.
 */
public class Lesson4ScanMethods {
    public static String whatAppDo = "This application displayed homework for previously lessons 2,3 and 4. Type 'exit' to exit.";
    public static String whatNeedToBeEnter = "Enter lesson number to see homework(2,3 or 4 and hit Enter): ";
    private static String exitText = "Thanks goodbye, please leave a comment";
    private static String wordForCloseApp = "exit";
    private static String whatWasEnteredWrong = "You have entered a non numeric value, please enter number with range from 2 till 4";
    private static float floatValueToChar = 67.8f;
    private static char charValueToInt = 'a';
    private static int intValueToChar = 366;

    public static void scanNum() {
        Scanner sc = new Scanner(System.in);
        do {
            if (sc.hasNextInt()) {
                int enteredInt = sc.nextInt();
                System.out.print("Homework lesson ");
                Lesson4ScanMethods.lessonsTwoThreeFour(enteredInt);
                Lesson4ScanMethods.appExplenation(whatNeedToBeEnter);
                //Have some problem with duplicating sys.out (HELP!!!)
            } else if (sc.hasNext()) {
                String str1 = sc.nextLine();
                if (str1.equals(wordForCloseApp)) {
                    Lesson4ScanMethods.appExplenation(exitText);

                    sc.close();
                    break;
                }
                Lesson4ScanMethods.appExplenation(whatWasEnteredWrong);
                Lesson4ScanMethods.appExplenation(whatNeedToBeEnter);
            }
        } while (sc.hasNextLine());
    }

    public static void appExplenation(String textToUser) {
        System.out.println(textToUser);
    }

    public static int lessonsTwoThreeFour(int homeWorkNumber) {
        //use switch instead if statement
        switch (homeWorkNumber) {
            case 2:
                userEnterLesson2();
                break;
            case 3:
                     /*Also HomeWork Lesson3 can be found:
                        main.java.com.karabeinikovAntonSikret87.app.classwork.lesson3  class MeathFunc(methods)
                         test.java.com.karabeinikovAntonSikret87.app.classwork.lesson3  class MeathFuncTest(unit tests)*/
                userEnterLesson3();
                     /*MathFuncTest mathFuncTest = new  MathFuncTestt();
                        MathFuncTest.lessonEightTest();*/
                break;
            case 4:
                userEnterLesson4();
                     /*Lesson4RunnerTest lesson4RunnerTest = new  Lesson4RunnerTest();
                        lesson4RunnerTest.lessonEightTest();*/
            default:
                userEnterOtherNumbers();
        }
        return homeWorkNumber;
    }

    private static void userEnterLesson2() {
        System.out.println(" 2 converting types: ");
        PrimitiveConvertor conv = new PrimitiveConvertor();
        conv.floatToChar(floatValueToChar);
        conv.charToInt(charValueToInt);
        conv.intToChar(intValueToChar);
    }

    private static void userEnterLesson3() {
        System.out.println(" 3, unit testing Methods in MathFuncWith20UnitTest class : Was not able to create object MathFuncTest class ");
    }

    private static void userEnterLesson4() {
        System.out.println(" 4, unit testing Methods in Lesson4ScanMethods class : Was not able to create object MathFuncTest class Lesson4RunnerTest");
    }

    private static void userEnterOtherNumbers() {
        System.out.println("range is from 2 to 4.");
    }
}


//        if (a == 2) {
//            System.out.println(" 2 converting types: ");
//            PrimitiveConvertor conv = new PrimitiveConvertor();
//            conv.floatToChar(floatValueToChar);
//            conv.charToInt(charValueToInt);
//            conv.intToChar(intValueToChar);
//        } else if (a == 3) {
//            /*Also HomeWork Lesson3 can be found:
//              main.java.com.karabeinikovAntonSikret87.app.classwork.lesson3  class MeathFunc(methods)
//              test.java.com.karabeinikovAntonSikret87.app.classwork.lesson3  class MeathFuncTest(unit tests)*/
//            System.out.println(" 3, unit testing Methods in MathFuncWith20UnitTest class : Was not able to create object MathFuncTest class ");
//            /*MathFuncTest mathFuncTest = new  MathFuncTestt();
//            MathFuncTest.lessonEightTest();*/
//
//        } else if (a == 4) {
//            System.out.println(" 4, unit testing Methods in Lesson4ScanMethods class : Was not able to create object MathFuncTest class Lesson4RunnerTest");
//            /*Lesson4RunnerTest lesson4RunnerTest = new  Lesson4RunnerTest();
//            lesson4RunnerTest.lessonEightTest();*/
//
//        } else {
//            System.out.println("range is from 2 to 4.");
//        }
//        return a;
//    }



