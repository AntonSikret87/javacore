package com.karabeinikovAntonSikret87.app.homework.lesson11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by AntonKa on 4/24/2017.
 */
public class EnterFromKeyboardAndSaveToFileLesson11 {
    public static String newCreatedFile = "src\\MyFile\\NewFile.txt";
    public static String myDir = System.getProperty("user.dir");
    public static File file = new File(myDir, newCreatedFile);
    public static boolean existFile = file.exists();

    public static void enterTextFromKeyboardAndWriteToFIle(Scanner input, BufferedWriter wr) throws IOException {

        System.out.print("Please enter text which will be saved in previously created file (type 'exit' to complete): ");

        while (true) {
            String scanLine = input.nextLine();
            if (scanLine.trim().equalsIgnoreCase("exit")) {
                break;
            }
            wr.write(scanLine);

        }
        wr.close();
        input.close();

    }


    public static void createFile(Scanner input) throws IOException {
        if (!existFile) {
            String strInput;
            do {
                System.out.print("Please enter correct name to create file (File Name should be = 'NewFile.txt') : ");
                strInput = input.next();
                File file = new File(newCreatedFile);
                file.createNewFile();
            }
            while (strInput.contains("NewFile.txt") == false);
        } else {
            System.out.print("");
        }
    }
}
