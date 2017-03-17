package com.karabeinikovAntonSikret87.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AntonKa on 3/15/2017.
 */
public class MathFuncTest {
    private int multuplyValueOne = 1;
    private int multuplyValueTwo = 2;
    private int sumValueOne = 1;
    private int sumValueTwo = 2;
    private int divideValueOne;
    private int divideValueTwo;
    String firstString = "(___";
    String secondString = ")(";
    String thirdString = "___)";
    MathFunc mathFunc = new MathFunc();


    public void setDevideValueOne(int divideValueOne) {
        if (divideValueOne == 0) {
            System.out.println("Value1 can't be 0!");
        } else {
            this.divideValueOne = divideValueOne;
        }
    }

    public int getDevideValueOne() {
        return divideValueOne;
    }

    public void setDevideValueTwo(int divideValueTwo) {
        if (divideValueTwo == 0) {
            System.out.println("Value2 can't be 0!");
        } else {
            this.divideValueTwo = divideValueTwo;
        }
    }

    public int getDevideValueTwo() {
        return divideValueTwo;
    }


    @Test
    public void multiplyTest() {
        int actualResult = mathFunc.multiply(multuplyValueOne, multuplyValueTwo);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumTest() {
        int actualResult = mathFunc.sum(sumValueOne, sumValueTwo);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTest() {
        setDevideValueOne(4);
        int valueOne = getDevideValueOne();
        setDevideValueTwo(2);
        int valueTwo = getDevideValueTwo();
        int actualResult = mathFunc.divide(valueOne, valueTwo);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtractionTest() {
        int actualResult = mathFunc.subtraction(4, 3);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addThreeStringsTest() {
        String actualResult = mathFunc.addThreeStrings(firstString, secondString, thirdString);
        String expectedResult = "(___)(___)";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMessageTest() {
        String actualResult = mathFunc.testMessage("Test Message Correct");
        String expectedResult = "Test Message Correct";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void floatToCharTest() {
        int actualResult = mathFunc.floatToChar(67.8f);
        char expectedResult = 'C';
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void intToCharTest() {
        int actualResult = mathFunc.intToChar(366);
        char expectedResult = 'Ů';
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void charToIntTest() {
        int actualResult = mathFunc.charToInt('a');
        int expectedResult = 97;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void intToDoubleTest() {
        int actualResult = mathFunc.doubleToInt(44.5);
        int expectedResult = 44;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void concatTest() {
        String actualResult = mathFunc.concat(true, "anton ", "karabeinikov");
        String expectedResult = "ANTON KARABEINIKOV";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isOddTest() {
        Boolean actualResult = mathFunc.isOdd(3);
        Boolean expectedResult = new Boolean(true);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void maxOfIntsTest() {
        int actualResult = mathFunc.maxOfInts(3, 6);
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void minOfIntsTest() {
        int actualResult = mathFunc.minOfInts(3, 6);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void increaceIntTest() {
        int actualResult = mathFunc.increace(6);
        int expectedResult = 7;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void decreaceIntTest() {
        int actualResult = mathFunc.decreace(6);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void changeYearTest() {
        int actualResult = mathFunc.changeYear(2058);
        int expectedResult = 2017;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void strLenghtTest() {
        int actualResult = mathFunc.strLenght("Antonidze");
        int expectedResult = 9;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void sqrtOfDoubleToIntTest() {
        int actualResult = (int) mathFunc.sqrtOfDoubleToInt(16.0);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void negativeToPositiveTest() {
        int actualResult = mathFunc.negativeToPositive(-16);
        int expectedResult = 16;
        Assert.assertEquals(expectedResult, actualResult);
    }
}

