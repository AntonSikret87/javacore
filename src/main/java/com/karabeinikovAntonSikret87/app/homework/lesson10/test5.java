package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by AntonKa on 4/27/2017.
 */
public class test5 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        System.out.print("Enter the name of friend  : ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        //for(int i=0; i<array.size(); i++) {
        while (scan.hasNextLine()){

            array.add(line);
        }
         scan.close();


        System.out.print(array);
        //Now show your friend's name one by one
        for (String s: array) {
            System.out.print(s);

        }
    }
}
