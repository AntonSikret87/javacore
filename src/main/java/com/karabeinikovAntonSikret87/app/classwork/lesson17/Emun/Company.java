package com.karabeinikovAntonSikret87.app.classwork.lesson17.Emun;

/**
 * Created by AntonKa on 5/16/2017.
 */
public enum Company {
    EBAY(30,"EbayInc"), GOOGLE(15,"Google Inc");

    private int value;
    private String fullName;

    Company(int value, String fullName) {
        this.value = value;
        this.fullName = fullName;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
       for(Company cName: Company.values()){
           System.out.println("Company Value: " + cName.getValue()
                   +  " Company Name: " + cName);
       }

    }


}
