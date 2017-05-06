package com.karabeinikovAntonSikret87.app.homework.lesson10;

/**
 * Created by AntonKa on 5/6/2017.
 */
public class Lesson10RunnerSubTaskE {
    public static void main(String[] args) {
        Lesson10LogicSubTaskECesarEng cesarEng = new Lesson10LogicSubTaskECesarEng();
        String encript = cesarEng.encrypt("Anton molodec", 1, 1);
        System.out.println(encript);
        String decript = cesarEng.decrypt(encript, 1, 1);
        System.out.println(decript);
    }
    }