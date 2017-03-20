package com.karabeinikovAntonSikret87.app.classwork.lesson4;


import com.karabeinikovAntonSikret87.runners.homework.Lesson4Runner;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AntonKa on 3/19/2017.
 */
public class Lesson4RunnerTest {


    @Test
    public void subtractionTest() {
        int actualResult = Lesson4Runner.lessonsTwoThreeFour(4);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
