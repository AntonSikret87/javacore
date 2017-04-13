package com.karabeinikovAntonSikret87.app.classwork.lesson10;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by AntonKa on 4/11/2017.
 */
public class Lesson10BufferReader {
    public static void main(String[] args) {
        BufferedReader reader;
        String pathToFile = "src\\MyFile\\text.txt";

        try {
            reader = new BufferedReader(new FileReader(pathToFile));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Anyway print this no matter what");
        }
    }
}
