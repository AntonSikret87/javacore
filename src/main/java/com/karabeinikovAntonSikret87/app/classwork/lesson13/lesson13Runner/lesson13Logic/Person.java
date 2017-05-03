package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic;

/**
 * Created by AntonKa on 4/25/2017.
 */
public class Person {
    private String name;
    private String university;
    private int age;
    private String degree;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


    public Person(String name){
          this.name =name;
    }
    public void printPersonInfo(){
        System.out.println("Person info: " + getName());
    }
    public void showDegree(){
        System.out.println("General degree");
    }
}
