package com.karabeinikovAntonSikret87.app.classwork.lesson20.Generic;

/**
 * Created by AntonKa on 5/30/2017.
 */
public class Box<T extends Number> {
    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public <U extends Pair> U inspect(U u){
        System.out.println(u.getKey());
        return u;
    }



}
