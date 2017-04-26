package com.karabeinikovAntonSikret87.app.homework.lesson13;

/**
 * Created by AntonKa on 4/24/2017.
 */
public class Human {
    private int age;
    private String name;
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age <= 120 && age >= 1){
            this.age = age;
            System.out.println("New age setted");
        }else {
            System.out.println("Age invalid");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
