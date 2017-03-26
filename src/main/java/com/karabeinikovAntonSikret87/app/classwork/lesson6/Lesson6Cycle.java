package com.karabeinikovAntonSikret87.app.classwork.lesson6;

import java.util.Scanner;

/**
 * Created by AntonKa on 3/24/2017.
 */
public class Lesson6Cycle {

    public static int a, b;

    public static void main(String[] args) {
        Lesson6Cycle l5 = new Lesson6Cycle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first int:");
        a = sc.nextInt();
//        System.out.println("Enter second int:");
//        b = sc.nextInt();
//        l5.compareWhile();
        l5.cycleEnteredInt(a);
    }

    public void compareWhile() {
        while (a > b) {
            a--;
            System.out.println(a);
            System.out.println(b + " -> " + a);
            if (a <= b) {
                System.out.println("a and b equal, " + a + " = " + b);
            }
        }
    }

    public void cycleEnteredInt(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("Print entered value every cycle " + i);
        }
    }
}
