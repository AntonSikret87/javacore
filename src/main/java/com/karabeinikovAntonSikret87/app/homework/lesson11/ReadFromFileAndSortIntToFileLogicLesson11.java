package com.karabeinikovAntonSikret87.app.homework.lesson11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Created by AntonKa on 4/23/2017.
 */
public class ReadFromFileAndSortIntToFileLogicLesson11 {
    public static String pathToFileSorted = "src\\MyFile\\SortIntArr.txt";
    public static String pathToFileUnsorted = "src\\MyFile\\UnsortIntArr.txt";

    public static void sortIntegersAscend(List<Integer> numbers) {
        Collections.sort(numbers);
        //System.out.println(numbers);
    }

    public static void readFromFileIntegers(BufferedReader br, List<Integer> numbers) throws IOException {
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] strNumbers = line.split(" ");
            for (String strNumber : strNumbers) {
                numbers.add(Integer.parseInt(strNumber));
            }
            System.out.println("Unsorted list: " + line);
        }
        br.close();
    }
    public static void writeToFileIntegers(BufferedWriter wr, List<Integer> numbers) throws IOException {

        System.out.print("Sorted list: " );
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
            wr.append(numbers.get(i) + " ");

        }
        wr.newLine();
        wr.close();
    }
}