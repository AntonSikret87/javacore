package com.karabeinikovAntonSikret87.app.classwork.lesson17.Emun;

/**
 * Created by AntonKa on 5/16/2017.
 */
public enum Selebrations {
    NEW_YEAR(1,"January","New Year"), EASTER(16,"April","Easter"), MY_BIRTHDAY(23,"June","My birthday");

    private int numberDay;
    private String month;
    private String event;


    Selebrations(int numberDay, String month, String event) {
        this.numberDay = numberDay;
        this.month = month;
        this.event = event;
    }
    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
