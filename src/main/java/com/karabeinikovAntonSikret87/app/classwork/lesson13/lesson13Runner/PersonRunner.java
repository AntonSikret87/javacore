package com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner;

import com.karabeinikovAntonSikret87.app.classwork.lesson13.lesson13Runner.lesson13Logic.Lecture;
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
        student.setName("ANTON");
        student.setUniversity("NAU!");
        student.setAge(22);
        student.printPersonInfo();


        Person person = new Person(nameStudent);
        person.setName("Vika");
        person.printPersonInfo();

        person.setName("Afanasij");


        String universityLecture ="Oxford";
        person.setAge(99);
        String name = "Anton";
        String facultyLecture = "Math";
        int expirianceLecture = 55;
        String degreeLecture = "Master";


        Lecture lecture = new Lecture(name,universityLecture,person.getAge()
                ,facultyLecture,expirianceLecture,degreeLecture);
        lecture.printLectureInfo();


        lecture.showDegree();
        student.setDegree("Slow student");
        student.showDegree();
    }
}
