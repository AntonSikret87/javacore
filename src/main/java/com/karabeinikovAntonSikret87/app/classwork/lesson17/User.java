package com.karabeinikovAntonSikret87.app.classwork.lesson17;

/**
 * Created by AntonKa on 5/16/2017.
 */
public class User {
    private String name, passport;
    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getAge() != user.getAge()) return false;
        return getPassport() != null ? getPassport().equals(user.getPassport()) : user.getPassport() == null;
    }

    @Override
    public int hashCode() {
        int result = getPassport() != null ? getPassport().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }


}
