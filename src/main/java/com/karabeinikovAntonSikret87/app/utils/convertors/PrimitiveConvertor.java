package com.karabeinikovAntonSikret87.app.utils.convertors;

/**
 * Created by AntonKa on 3/10/2017.
 */
public class PrimitiveConvertor {

    public void floatToChar(float floatValue) {
        char newCharValueFromFloat = (char) floatValue;
        System.out.println
                ("Input float value is " + floatValue + ". Output char value is " + newCharValueFromFloat);
    }

    public void intToChar(int intValue) {
        char newCharValueFromInt = (char) intValue;
        System.out.println
                ("Input int value is " + intValue + ". Output char value is " + newCharValueFromInt);
    }

    public void charToInt(char charValue) {
        int newIntValueFromChar = (int) charValue;
        System.out.println
                ("Input char value is " + charValue + ". Output int value is " + newIntValueFromChar);
    }
}
