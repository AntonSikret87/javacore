package com.karabeinikovAntonSikret87.app.homework.lesson10;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by AntonKa on 4/27/2017.
 */
public class test6 {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
                String s;
                do {
                    System.out.println("Введите имена");
                    s = sc.next();
                  //  if (!s.isEmpty()) {
                        arrayList.add(s);
                  //  }
                }
                while (!s.matches("E"));

                for (Object o : arrayList) {
                    System.out.println(o);
                }
            }
        }



