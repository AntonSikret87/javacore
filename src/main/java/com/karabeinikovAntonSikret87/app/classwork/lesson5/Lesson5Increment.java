package com.karabeinikovAntonSikret87.app.classwork.lesson5;

/**
 * Created by AntonKa on 3/24/2017.
 */
public class Lesson5Increment {
    public static void main(String[] args) {
//        int a = 1;
//        System.out.println("Original a " + a);
//        System.out.println("Post-incremet a " + a++);
//        System.out.println("After Post-incremet a " + a);
//        System.out.println("Pre-incremet a " + ++a);
//        System.out.println("After Pre-incremet a " + a);

        Lesson5Increment lI = new Lesson5Increment();
        lI.evenOdd();
    }

    int counter = 20;

    public void evenOdd() {
        for (int i = 1; i <=counter; i++) {
            if (i % 2 == 0) {
                System.out.println("Even " + i);
                counter++;
            } else {
                System.out.println("Odd " );
            }
        }
    }
}

