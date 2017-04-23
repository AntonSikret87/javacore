package com.karabeinikovAntonSikret87.app.homework.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AntonKa on 4/14/2017.
 */
public class Lesson10 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a list of numbers: ");
        String userinput = in.nextLine();

        while (in.hasNextInt()) {
            int input = in.nextInt();
            numbers.add(input);

        }
        System.out.println("Your entered values: " );
        for(int i: numbers){
            System.out.print(i + ", ");
        }

        //bublAscend(numbers);
        System.out.println("Would you like to sort from > or < ");

        if(in.equals(">")){
            System.out.println("Ascending");
        }else if(in.next().equals("<")){
            System.out.println("Descending");
        }
    }
    public static void bublAscend(ArrayList<Integer> array) {
        int i, j, temp;
        for (i = 0; i < array.size(); i++) {
            for (j = 0; j < array.size() - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted accending list of integers:");
        for (int r : array) {
            System.out.print(r + ", ");
            //System.out.println(Arrays.toString(array));
        }
    }

    public static void bublDescend(int[] array) {
        int i, j, temp;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted descending list of integers:");
        System.out.println(Arrays.toString(array));
    }




}
