package com.karabeinikovAntonSikret87.app.homework.lesson13;

/**
 * Created by AntonKa on 4/24/2017.
 */
public class RunerHomeworkLesson13 {
    public static void main(String[] args){
        String human1Name = "Valentin";
        int human1Age = 63;
        Human human1 =  new Human(human1Age,human1Name);
        System.out.println(human1.getAge() + " "  + human1.getName());
        System.out.println(" ");

        Human human2 =  new Human(44,"ff");
        human2.setAge(2);
        human2.setName("Antonidze");
        String myNameIs = human2.getName();
        int myAgeIs = human2.getAge();
        System.out.println("Age: " + myAgeIs + ", " + "Name: " + myNameIs);
        System.out.println(" ");

        WhiteCollar whiteCollar1 = new WhiteCollar(5,"ddd");
        whiteCollar1.setCompany("aRZerr,-");
        String compName = whiteCollar1.getCompany();
        System.out.println("Company name: " + compName);
        System.out.println(" ");

        WhiteCollar whiteCollar2 = new WhiteCollar(25,"Arcadij", "Yandex9");
        whiteCollar2.setAge(85);
        whiteCollar2.setName("Alexandro");
        whiteCollar2.setCompany("Terrasoft-#");
        System.out.println("Age: " + whiteCollar2.getAge() +" "
        + "Name: " + whiteCollar2.getName() + " "
        + "Company: " + whiteCollar2.getCompany());
    }
}
