package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.classwork;

import com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic.Person;


/**
 * Created by AntonKa on 4/25/2017.
 */
public class Lecture extends Person {
    public String faculty;
    public int expiriance;


    public Lecture(String name,String university, int age, String faculty,int expiriance,String degree ) {
        super(name);
        this.age =age;
        this.faculty=faculty;
        this.expiriance=expiriance;
        this.degree=degree;
       this.university=university;
    }

    public void printLectureInfo() {
        System.out.println("Lecture name: " + name + ", "
                + "Univercity: " + university + ", "
                + "Age: " + age + ", "
                + "Faculty: " + faculty + ", "
                + "Ecpiriance: " + expiriance + ", "
                + "Degree: " + degree);
    }
    public void showDegree() {
        System.out.println("Lecture degree: " + degree);
    }

}

