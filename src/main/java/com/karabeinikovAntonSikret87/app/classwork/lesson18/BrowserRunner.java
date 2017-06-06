package com.karabeinikovAntonSikret87.app.classwork.lesson18;

/**
 * Created by AntonKa on 5/23/2017.
 */
public class BrowserRunner {
    public static void main(String[] args) {
        Browser browser =  new Browser();
        browser.invoke("Chrome");
        browser.invoke("Opera", 34);
    }
}
