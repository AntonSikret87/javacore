package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic;

/**
 * Created by AntonKa on 4/25/2017.
 */
public class Person {
    public String name;
    public String university;
    public int age;
    public String degree;

    public Person(String name){
          this.name=name;
    }
    public void printPersonInfo(){
        System.out.println("Person info: " + name);
    }
    public void showDegree(){
        System.out.println("General degree");
    }
}
