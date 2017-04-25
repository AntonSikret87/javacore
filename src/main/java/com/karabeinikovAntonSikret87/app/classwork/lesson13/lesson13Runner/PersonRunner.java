package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner;

import com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.classwork.Lecture;
import com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic.Person;
import com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic.Student;

/**
 * Created by AntonKa on 4/25/2017.
 */
public class PersonRunner {
    public static void main(String[] args) {
        String nameStudent = "Anton";
        String universityStudent = "NAU";

        Student student = new Student(nameStudent,universityStudent);

        student.age = 22;
        student.printPersonInfo();

        Person person = new Person(nameStudent);
        person.name = "Vika";
        person.printPersonInfo();;


        String nameLecture = "Afanasij";
        String universityLecture ="Oxford";
        int ageLecture = 99;
        String facultyLecture = "Math";
        int expirianceLecture = 55;
        String degreeLecture = "Master";

        Lecture lecture = new Lecture(nameLecture,universityLecture,ageLecture
                ,facultyLecture,expirianceLecture,degreeLecture);
        lecture.printPersonInfo();

        lecture.printLectureInfo();

        lecture.showDegree();
        student.degree = "Slow student";
        student.showDegree();
    }
}
