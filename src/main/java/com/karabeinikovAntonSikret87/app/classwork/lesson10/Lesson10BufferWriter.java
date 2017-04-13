package com.karabeinikovAntonSikret87.app.classwork.lesson10;

import java.io.*;

/**
 * Created by AntonKa on 4/11/2017.
 */
public class Lesson10BufferWriter  {
    public static void main(String[] args) throws IOException {
        String pathToFile = "src\\MyFile\\text.txt";
        String firstLine = "My first String";
        String secondLine = "My second String";

        BufferedWriter writer;
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFile)));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();


    }
}
