//package com.karabeinikovAntonSikret87.app.homework.lesson10;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * Created by AntonKa on 4/14/2017.
// */
//public class test {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        Scanner stdin = new Scanner(System.in);
//
//        do {
//            System.out.println("Current list is " + list);
//            System.out.println("Add more? (y/n)");
//            if (stdin.next().startsWith("y")) {
//                System.out.println("Enter : ");
//                list.add(stdin.next());
//            } else {
//                break;
//            }
//        } while (true);
//    }
//    public static void bublAscend(List<String> array) {
//        int i, j, temp;
//        for (i = 0; i < array.size(); i++) {
//            for (j = 0; j < array.size() - 1; j++) {
//                if (array.get(j) > array.get(j + 1)) {
//                    temp = array.get(j);
//                    array.set(j, array.get(j + 1));
//                    array.set(j + 1, temp);
//                }
//            }
//        }
//        System.out.println("Sorted accending list of integers:");
//        for (int r : array) {
//            System.out.print(r + ", ");
//            // System.out.println(Arrays.toString(array));
//        }
//    }
//}
