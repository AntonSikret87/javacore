package com.karabeinikovAntonSikret87.app.homework;

import com.karabeinikovAntonSikret87.app.classwork.lesson3.MathFunc;
import com.karabeinikovAntonSikret87.app.classwork.lesson4.Car;
import com.karabeinikovAntonSikret87.app.classwork.lesson4.CircleArea;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by AntonKa on 3/22/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class Lesson5HomeTest {
    MathFunc mathFunc = new MathFunc();
    @Test
    @FileParameters(value = "src/test/resources/testDataDevideValues.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderDevideTest(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, mathFunc.divide(argA, argB));
    }
    @Test
    @FileParameters(value = "src/test/resources/testDataAddDoorsAndWheels.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderAddDorrsAndWheelsTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, Car.addDoorsAndWheels(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/testDataAddThreeStrings.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderAddThreeStringsTest(String argA, String argB, String argC, String expOut) {
        Assert.assertEquals(expOut, mathFunc.addThreeStrings(argA, argB, argC));
    }
    @Test
    @FileParameters(value = "src/test/resources/testDataFloatToChar.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderFloatToCharTest(float argA, char expOut) {
        Assert.assertEquals(expOut, mathFunc.floatToChar(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/testDataCharToInt.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderCharToIntTest(char argA, int expOut) {
        Assert.assertEquals(expOut, mathFunc.floatToChar(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/testDataIsOdd.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderIsOddTest(int argA, Boolean expOut) {
        Assert.assertEquals(expOut, mathFunc.isOdd(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/testDataConcat.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderConcatTest(Boolean argA, String Str1, String Str2 , String expOut) {
        Assert.assertEquals(expOut, mathFunc.concat(argA, Str1, Str2));
    }
    @Test
    @FileParameters(value = "src/test/resources/testChangeYear.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderChangeYearTest(int argA, int expOut) {
        Assert.assertEquals(expOut, mathFunc.changeYear(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/testStrLenght.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderStrLenghtTest(String argA, int expOut) {
        Assert.assertEquals(expOut, mathFunc.strLenght(argA));
    } 

    @Test
    @FileParameters(value = "src/test/resources/testDataCalculateBigger.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderCalculateBiggerTest(int argA, int argB ) {
        CircleArea.calculateBigger(argA, argB);
        System.out.println();
       // Assert.assertEquals(expOut, );
    }
}
