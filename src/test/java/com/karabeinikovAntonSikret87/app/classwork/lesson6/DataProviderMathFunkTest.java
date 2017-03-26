package com.karabeinikovAntonSikret87.app.classwork.lesson6;

import com.karabeinikovAntonSikret87.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by AntonKa on 3/21/2017.
 */
@RunWith(JUnitParamsRunner.class)


public class DataProviderMathFunkTest {
    MathFunc mathFunc = new MathFunc();
    @Test
    @FileParameters(value = "src/test/resources/testDataMultuplyValues.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderAddTest(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, mathFunc.multiply(argA, argB));
    }
    @Test
    @FileParameters(value = "src/test/resources/testDataSubstractionValues.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderSubstractionTest(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, mathFunc.subtraction(argA, argB));
    }
    @Test
    @FileParameters(value = "src/test/resources/testDataDevideValues.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderDevideTest(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, mathFunc.divide(argA, argB));
    }
}
