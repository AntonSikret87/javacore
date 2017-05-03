package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import static com.karabeinikovAntonSikret87.app.homework.lesson8.Lesson8HomeWork.i;

/**
 * Created by AntonKa on 4/26/2017.
 */
public class test2 {
    public static void main(String[] args) {


//        //Enter delimiter
        Scanner str = new Scanner(System.in);
//        System.out.print("Type delimiter :");
//        String delimiter = str.nextLine();
//        System.out.print("Delimiter is:  " + delimiter);
        Pattern pattern = Pattern.compile("[A-Za-z]*");
        System.out.println(" ");

        //Enter array
        System.out.println("Enter values to Array, use ',' to separate Strings in Array: ");

       String line = str.nextLine();
      /* given string will be split by the argument delimiter provided. */
        String[] temp = line.split(",");

      System.out.println("Each string: ");
      /* print substrings */
        for (String s : temp) {
            System.out.print(s);
        }


        System.out.println(" ");
        for (int i = 0; i < temp.length; i++) {

               System.out.print(temp[i]);
              System.out.print(temp[1]);
        }

    }

}
