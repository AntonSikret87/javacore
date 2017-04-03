package com.karabeinikovAntonSikret87.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by AntonKa on 3/17/2017.
 */
public class CircleAreaRanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of Area1: ");
        int area1 = sc.nextInt();
        System.out.print("Enter a number of Area2: ");
        int area2 = sc.nextInt();
        System.out.print("Result of comparing Area1 and Area2: ");
        CircleArea.calculateBiggerIfStatment(area1,area2);
    }
}
