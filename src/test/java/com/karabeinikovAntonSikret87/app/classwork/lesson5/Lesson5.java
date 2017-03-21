package com.karabeinikovAntonSikret87.app.classwork.lesson5;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by AntonKa on 3/21/2017.
 */
public class Lesson5 {

    @Ignore("Not run")
    @Test(timeout = 6000)
    public void infinityTest(){
        while(true);
    }
}
