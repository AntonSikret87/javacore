package com.karabeinikovAntonSikret87.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by AntonKa on 3/17/2017.
 */
public class CircleAreaRanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area1 = sc.nextInt();
        int area2 = sc.nextInt();
        CircleArea.calculateBigger(area1,area2);
    }
}
