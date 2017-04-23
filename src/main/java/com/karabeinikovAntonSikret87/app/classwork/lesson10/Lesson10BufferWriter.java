package com.karabeinikovAntonSikret87.app.classwork.lesson10;

import java.io.*;

/**
 * Created by AntonKa on 4/11/2017.
 */
public class Lesson10BufferWriter  {
    public static void main(String[] args) throws IOException {

        String myDir = System.getProperty("user.dir");
        String osName = System.getProperty("os.name");
        System.out.println(myDir);
        System.out.println(osName);

        String pathToFileWindows = "src\\MyFile\\text.txt";
        String pathToFileLinux = "src/MyFile/text.txt";
        File fileW = new File(myDir, pathToFileWindows);
        File fileL = new File(myDir, pathToFileLinux);

        System.out.println(fileW.getAbsolutePath());


        boolean existFileForWin = fileW.exists();
        boolean existFileForLinux = fileL.exists();

        String firstLine = "My first String123";
        String secondLine = "My second String123";
        BufferedWriter writer;

        if(osName.toLowerCase().contains("win")){
            File file = new File(myDir, pathToFileWindows);
            System.out.println(file.getAbsolutePath());
        }else {
            File file = new File(myDir, pathToFileLinux);
            System.out.println(file.getAbsolutePath());
        }

//        if(existFileForLinux){
//        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFileLinux)));
//            writeToFile(firstLine, secondLine, writer);
//        }
//        else if(existFileForWin){
//            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFileWindows)));
//            writeToFile(firstLine, secondLine, writer);
//        }
    }

    public static void writeToFile(String firstL, String secondL, BufferedWriter writer) throws IOException {
        writer.append(firstL);
        writer.newLine();
        writer.append(secondL);
        writer.close();
    }
}
