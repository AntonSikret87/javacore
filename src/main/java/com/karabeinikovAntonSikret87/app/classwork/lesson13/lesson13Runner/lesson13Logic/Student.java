package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic;

/**
 * Created by AntonKa on 4/25/2017.
 */
public class Student extends Person {
    //IS A
    public Student(String name, String university) {
        super(name);
        this.setUniversity(university);
    }

    public void printPersonInfo(){
        System.out.println("Student name: " + getName()+ ", "
        + "Univercity: " + getUniversity() + ", "
        + "Age: " + getAge());
    }
    public void showDegree(){
        System.out.println("Student degree: " + getDegree());
    }
}
