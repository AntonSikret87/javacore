package com.karabeinikovAntonSikret87.app.homework.lesson11;

import java.io.*;
import java.util.ArrayList;
import static com.karabeinikovAntonSikret87.app.homework.lesson11.PolindromInOutRunnerLesson11.arrayInputStrings;

/**
 * Created by AntonKa on 4/13/2017.
 */
public class PolindromeLogicLesson11 {
    public static BufferedReader reader;
    public static String pathInputFile = "src\\MyFile\\inputPolindromeTexts.txt";
    public static  String pathOutputFile = "src\\MyFile\\outputPolindromeTexts.txt";
    //public ArrayList<String> arrayInputStrings = new ArrayList<String>();

    public static void writePolindromeToFile( ArrayList<String> valueString) throws IOException {
        BufferedWriter writer;
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathOutputFile)));
        for (String line : arrayInputStrings) {
            if (isPalindrome(line)) {
                // System.out.println("Palindrome:     " + line);
                writer.newLine();
                writer.write(String.valueOf(line) + "         is palindrom");

            } else {
                // System.out.println("Not palindrome: " + line);
                writer.newLine();
                writer.write(String.valueOf(line) + "        is not palindrome");
            }
        }
        writer.close();
    }


    public static void readPolindromeFromFile() throws IOException {
        reader = new BufferedReader(new FileReader(pathInputFile ));
        int i = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            arrayInputStrings.add(i, line);
            i++;
        }
        //  System.out.println(Arrays.toString(arrayInputStrings));
    }

    public static boolean isPalindrome(String value) {
        // Scan towards the middle, adjusting the start and end indexes.
        int min = 0;
        int max = value.length() - 1;

        while (true) {
            if (min > max) {
                return true;
            }
            // Move forward past non-letter chars at the start.
            while (!Character.isLetter(value.charAt(min))) {
                min++;
            }
            // Move backward past non-letter chars at the end.
            while (!Character.isLetter(value.charAt(max))) {
                max--;
            }
            char a = Character.toLowerCase(value.charAt(min));
            char b = Character.toLowerCase(value.charAt(max));
            // If letters are not equal, this is not a palindrome.
            if (a != b) {
                return false;
            }
            // Advance towards center.
            min++;
            max--;
        }
    }
}




