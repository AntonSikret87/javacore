package com.karabeinikovAntonSikret87.app.classwork.lesson17;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class UserRunner {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(10);
        user1.setName("Anton");
        user1.setPassport("UKR");


        User user2 = new User();
        user2.setAge(10);
        user2.setName("Vika");
        user2.setPassport("UKR");

        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}
