package com.karabeinikovAntonSikret87.app.homework.lesson11;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import static com.karabeinikovAntonSikret87.app.homework.lesson11.EnterFromKeyboardAndSaveToFileLesson11.newCreatedFile;

/**
 * Created by AntonKa on 4/24/2017.
 */
public class RunnerHometaskLesson11SubTaskC {
    public static void main(String[] args) throws IOException {
        //HomeWork Lesson11 Sub-Task c
        Scanner input = new Scanner(System.in);
        BufferedWriter wr1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newCreatedFile)));
        EnterFromKeyboardAndSaveToFileLesson11 writeFromConsoleToFile =new EnterFromKeyboardAndSaveToFileLesson11();
        writeFromConsoleToFile.createFile(input);
        writeFromConsoleToFile.enterTextFromKeyboardAndWriteToFIle(input, wr1);

    }
}


