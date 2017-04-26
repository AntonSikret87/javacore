package com.karabeinikovAntonSikret87.app.homework.lesson13;


/**
 * Created by AntonKa on 4/24/2017.
 */
public class WhiteCollar extends Human {
    private String company;
    String pattern = "[a-zA-Z ,-]+";

    public void setCompany(String company) {
        if (company.matches(pattern)) {
            this.company = company;
        } else {
            System.out.println("Company name is invalid");
        }
    }
    public String getCompany() {
        return company;
    }

    public WhiteCollar(int age, String name) {
        super(age, name);
    }

    public WhiteCollar(int age, String name, String company) {
        this(age, name);
        this.company=company;
    }
}
