package com.karabeinikovAntonSikret87.app.homework.lesson11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.karabeinikovAntonSikret87.app.homework.lesson11.ReadFromFileAndSortIntToFileLogicLesson11.pathToFileSorted;
import static com.karabeinikovAntonSikret87.app.homework.lesson11.ReadFromFileAndSortIntToFileLogicLesson11.pathToFileUnsorted;

/**
 * Created by AntonKa on 4/24/2017.
 */
public class RunnerHometaskLesson11SubTaskA {
    public static List<Integer> numbers = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {
        //HomeWork Lesson11 Sub-Task a
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFileSorted)));
        BufferedReader br = new BufferedReader(new FileReader(pathToFileUnsorted));
        ReadFromFileAndSortIntToFileLogicLesson11 readSortWriteLogic = new ReadFromFileAndSortIntToFileLogicLesson11();
        readSortWriteLogic.readFromFileIntegers(br, numbers);
        readSortWriteLogic.sortIntegersAscend(numbers);
        readSortWriteLogic.writeToFileIntegers(wr, numbers);
    }
}
