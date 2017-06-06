//package com.karabeinikovAntonSikret87.app.homework.lesson17.HW2;
//
//import java.io.*;
//import java.util.Scanner;
//
///**
// * Created by AntonKa on 5/29/2017.
// */
//public class RunnerAdressBook {
//
//    public static void main(String[] args) throws CloneNotSupportedException, IOException {
//
//        AdressBook addressBook = new AdressBook();
////        addressBook.addRecord("123-11-32", "Anton", "str1 ");
////        addressBook.addRecord("883-47-21", "Petro", "str2");
////        addressBook.addRecord("919-41-85", "Afanasij", "str3");
////        addressBook.addRecord("666","Anton", "777");
////        System.out.println(addressBook.allRecords());
////        System.out.println(addressBook.getRecord(3));
////        System.out.println(addressBook.updateRecord(3,"656","Anton1","777"));
////        System.out.println(addressBook.allRecords());
////        addressBook.removeRecord(1);
////        System.out.println(addressBook.allRecords());
//        Scanner sc;
//        String line;
//        System.out.println("Actions: (add)add record, (del)delete record, (find)find by id record, (update)update record, (show)show all record, (exit)Close app");
//
//        sc = new Scanner(System.in);
//        line = sc.nextLine();
//
//        do {
//            switch (line) {
//                case "add": {
//                    System.out.println("Enter phone number:");
//                    String phone = sc.nextLine();
//                    System.out.println("Enter name:");
//                    String name = sc.nextLine();
//                    System.out.println("Enter address:");
//                    String address = sc.nextLine();
//                    addressBook.addRecord(phone, name, address);
//                    addressBook.saveToFile();
//                    break;
//                }
//                case "del": {
//                    System.out.println("Enter id record:");
//                    String idRecord = sc.nextLine();
//                    // addressBook.removeRecord(Long.parseLong(idRecord));
//                    addressBook.removeLineFromFile(idRecord);
//
//                    break;
//                }
//                case "find": {
//                    System.out.println("Enter ID reord to find:");
//                    String idRecord = sc.nextLine();
//                    addressBook.removeRecord(Long.parseLong(idRecord));
//                    break;
//                }
//                case "update": {
//                    System.out.println("Enter id record:");
//                    String idRecord = sc.nextLine();
//                    System.out.println("Enter phone number:");
//                    String phone = sc.nextLine();
//                    System.out.println("Enter name:");
//                    String name = sc.nextLine();
//                    System.out.println("Enter address:");
//                    String address = sc.nextLine();
//                    addressBook.updateRecord(Long.parseLong(idRecord), phone, name, address);
//                    break;
//                }
//                case "show": {
//                    addressBook.showAll();
//                    break;
//                }
//                case "search": {
//                    System.out.println("Enter value to find:");
//                    String phraseToFind = sc.nextLine();
//                    //addressBook.serch(phraseToFind);
//                    addressBook.searchInFile(phraseToFind);
//                    break;
//                }
//                default: {
//                    throw new IllegalArgumentException("Invalid command: " + line);
//                }
//            }
//        } while (line.equals("exit"));
//
//    }
//}
//
//
//
//
//
//
//
//
//
