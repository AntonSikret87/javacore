package com.karabeinikovAntonSikret87.app.classwork.lesson20.ClassWorkGenerics;

/**
 * Created by AntonKa on 5/30/2017.
 */
public class CompareData <K> implements Compare{
    private K key;

    public CompareData(K key) {
        this.key = key;
    }

    @Override
    public K getKey() {
        return key;
    }
}
