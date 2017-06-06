package com.karabeinikovAntonSikret87.app.classwork.lesson18;

/**
 * Created by AntonKa on 5/23/2017.
 */
public class Browser {
    private String name;
    private int version;

    public void invoke(String name){
        System.out.println(name);
    }

    public void invoke(String name, int version){
        invoke(name);
        System.out.print(" " + version);
    }


}
