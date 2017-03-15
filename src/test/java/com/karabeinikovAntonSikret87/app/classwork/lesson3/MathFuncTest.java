package com.karabeinikovAntonSikret87.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AntonKa on 3/15/2017.
 */
public class MathFuncTest {
    public int multuplyValueOne = 1;
    public int multuplyValueTwo = 2;
    public int SumValueOne = 1;
    public int SumValueTwo = 2;
    MathFunc mathFunc = new MathFunc();

    @Test
    public void multiplyTest(){
        int actualResult = mathFunc.multiply(multuplyValueOne,multuplyValueTwo);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void sumTest(){
        int actualResult = mathFunc.sum(SumValueOne,SumValueTwo);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
