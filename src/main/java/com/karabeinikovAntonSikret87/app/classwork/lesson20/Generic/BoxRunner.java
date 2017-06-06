package com.karabeinikovAntonSikret87.app.classwork.lesson20.Generic;

/**
 * Created by AntonKa on 5/30/2017.
 */
public class BoxRunner {
    public static void main(String[] args) {
       // Box<String> numberBox = new Box<>("10"); // Compile error
        Box<Integer> numberBox = new Box<>(10);
        Pair<String, Integer> p1 = new OrderPair<>("Odd", 3);
        numberBox.inspect(p1);
       // numberBox.inspect(new Integer(10)); // Compile error (Incompetibpe bounds)

    }
}
