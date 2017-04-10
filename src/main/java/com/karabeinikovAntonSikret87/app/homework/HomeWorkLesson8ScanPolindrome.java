package com.karabeinikovAntonSikret87.app.homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by AntonKa on 4/8/2017.
 */
//HomeworkLesson9 Subtask b
public class HomeWorkLesson8ScanPolindrome {
    public static void main(String[] args) {
        String line = "";

        Scanner scanner = new Scanner(System.in);
        while (!line.equals("exit")) {

            System.out.println(" ");
            System.out.println("Enter string polindrome: ");

            line = scanner.nextLine();

            if (polindromTest(line.toLowerCase(Locale.ENGLISH).replaceAll("\\W", "")))
                System.out.println("Your string is a palindrome!");
            else
                System.out.println("Your string is not a palindrome.");


//        do{
//            System.out.println(" ");
//            System.out.println("Enter string polindrome: ");
//
//        s = scanner.nextLine();
//            if (polindromTest(s.toLowerCase(Locale.ENGLISH).replaceAll("\\W", "")))
//                System.out.println("Your string is a palindrome!");
//            else
//                System.out.println("Your string is not a palindrome.");
//        }while(!s.equals("exit"));
        }
    }


    public static boolean polindromTest(String str) {
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        if (str.length() <= 2)
            return true;
        else if (first != last)
            return false;
        else
            return polindromTest(str.substring(1, str.length() - 1));
    }
}

