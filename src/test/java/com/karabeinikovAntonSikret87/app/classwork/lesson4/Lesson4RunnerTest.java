package com.karabeinikovAntonSikret87.app.classwork.lesson4;


import com.karabeinikovAntonSikret87.runners.homework.Lesson4ScanMethods;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AntonKa on 3/19/2017.
 */
public class Lesson4RunnerTest {


    @Test
    public void lessonTwoTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(2);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lessonThreeTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(3);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lessonFourTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(4);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lessonOneTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(1);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lessonFiveTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(5);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lessonSixTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(6);
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lessonSevenTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(7);
        int expectedResult = 7;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lessonEightTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(8);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lessonNineTest() {
        int actualResult = Lesson4ScanMethods.lessonsTwoThreeFour(9);
        int expectedResult = 9;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void scanTest() {
        //How it can be tested?

    }

}
