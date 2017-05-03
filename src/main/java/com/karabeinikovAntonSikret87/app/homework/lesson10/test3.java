package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by AntonKa on 4/26/2017.
 */
public class test3 {
    public static void main(String[] args) {
        String delimiter = ",";
        String str = "time,rry,immy,Camden";
        StringTokenizer st = new StringTokenizer(str,delimiter);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
