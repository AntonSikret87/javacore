package com.karabeinikovAntonSikret87.app.homework.lesson18.HIW1;

/**
 * Created by AntonKa on 6/6/2017.
 */
public class AdressBookRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        AdressBook addressBook = new AdressBook();
        addressBook.addRecord("333","Anton","555");
        addressBook.addRecord("111","Anton","222");
        addressBook.addRecord("2222","Anton","sdas");
        addressBook.removeRecord(2);
        System.out.println(addressBook.getRecord(0));
        addressBook.updateRecord(0,"7777","7777","7777");
        System.out.println(addressBook.allRecords());
    }
}