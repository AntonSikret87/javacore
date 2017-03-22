package com.karabeinikovAntonSikret87.runners;

import com.karabeinikovAntonSikret87.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by AntonKa on 3/13/2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor conv = new PrimitiveConvertor();
        conv.floatToChar(445.54f);
        conv.charToInt('a');
        conv.intToChar(366);
    }
}
