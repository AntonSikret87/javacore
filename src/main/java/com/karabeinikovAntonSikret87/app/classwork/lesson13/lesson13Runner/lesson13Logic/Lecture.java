package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic;

import com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic.Person;


/**
 * Created by AntonKa on 4/25/2017.
 */
public class Lecture extends Person {

    private String faculty;
    private int expiriance;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getExpiriance() {
        return expiriance;
    }

    public void setExpiriance(int expiriance) {
        this.expiriance = expiriance;
    }


    public Lecture(String name,String university, int age, String faculty,int expiriance,String degree ) {
        super(name);
        this.setAge(age);
        this.setFaculty(faculty);
        this.setExpiriance(expiriance);
        this.setDegree(degree);
        this.setUniversity(university);
    }

    public void printLectureInfo() {
        System.out.println("Lecture name: " + getName() + ", "
                + "Univercity: " + getUniversity() + ", "
                + "Age: " + getAge() + ", "
                + "Faculty: " + getFaculty() + ", "
                + "Ecpiriance: " + getExpiriance() + ", "
                + "Degree: " + getDegree());
    }
    public void showDegree() {
        System.out.println("Lecture degree: " + getDegree());
    }

}

