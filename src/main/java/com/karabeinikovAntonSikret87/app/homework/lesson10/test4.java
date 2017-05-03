package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by AntonKa on 4/27/2017.
 */
public class test4 {
    public static void main(String[] args) {
        // Initialize Scanner object
        ArrayList<String> array = new ArrayList<String>();
        System.out.println("Enter values to Array, use ',' to separate Strings in Array: ");
        Scanner scan = new Scanner(System.in);
        // declare the delimiter to be used by Scanner object
        scan.useDelimiter(",");

    /*Initialize the String pattern which
    signifies that the String token contains
    characters of the alphabet only*/
        Pattern pattern = Pattern.compile("[A-Za-z]*");

        if (scan.hasNext()) {
            System.out.print("[A-Za-z] Simbols are displayed: ");
            // check if the token consists of declared pattern
            if (scan.hasNext(pattern)) {
                System.out.print(scan.next());
            }

        }
        scan.close();
    }
}


