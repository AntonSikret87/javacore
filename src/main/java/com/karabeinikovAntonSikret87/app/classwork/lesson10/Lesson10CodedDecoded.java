package com.karabeinikovAntonSikret87.app.classwork.lesson10;

import java.util.Scanner;

/**
 * Created by AntonKa on 4/11/2017.
 */
public class Lesson10CodedDecoded {
    public static String plainTextStringEncode =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public static String cypherTextStringEncode = "09876543210ZYXWVUTSRQPONMLKJIHGFEDCBA";

    public static String plainTextStringDecode =  "09876543210ZYXWVUTSRQPONMLKJIHGFEDCBA";
    public static String cypherTextStringDecode = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public static void giveMeDecodedString(String codedString) {
        String decodedString = stringDecode(codedString);
        System.out.println("Decode previously coded string back: " + decodedString);
    }

    public static String giveMeCodedString(String line) {
        String codedString = stringEncode(line);
        System.out.println("Coded String is: " + codedString);
        return codedString;
    }

    public static String scannerToMeSrtingToCode() {
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to code: ");
        line = sc.nextLine();
        return line;
    }

    public static String stringEncode(String toEncode) {
        StringBuilder stringBuilder = new StringBuilder(toEncode);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < plainTextStringEncode.length(); j++) {
                if (stringBuilder.charAt(i) == plainTextStringEncode.charAt(j)) {
                    stringBuilder.setCharAt(i, cypherTextStringEncode.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String stringDecode(String toDecode) {
        StringBuilder stringBuilder = new StringBuilder(toDecode);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < plainTextStringDecode.length(); j++) {
                if (stringBuilder.charAt(i) == plainTextStringDecode.charAt(j)) {
                    stringBuilder.setCharAt(i, cypherTextStringDecode.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}
