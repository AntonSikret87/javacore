package com.karabeinikovAntonSikret87.app.homework.lesson12;

/**
 * Created by AntonKa on 4/24/2017.
 */
public class RunerHomeworkLesson12 {
    public static void main(String[] args){
        String human1Name = "Valentin";
        int human1Age = 63;
        Human human1 =  new Human(human1Age,human1Name);
        System.out.println(human1.getAge() + " "  + human1.getName());


        Human human2 =  new Human(44,"ff");
        human2.setAge(2);
        human2.setName("Antonidze");
        String myNameIs = human2.getName();
        int myAgeIs = human2.getAge();
        System.out.println("Age: " + myAgeIs + ", " + "Name: " + myNameIs);


        WhiteCollar whiteCollar = new WhiteCollar(5,"ddd");
        whiteCollar.setCompany("aRZerr,-#");
        String compName = whiteCollar.getCompany();
        System.out.println("Company name: " + compName);
    }
}
