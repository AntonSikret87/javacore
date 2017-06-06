package com.karabeinikovAntonSikret87.app.classwork.lesson18.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AntonKa on 5/23/2017.
 */
public class Arraylist1 {
    public static void main(String[] args) {
        String bmw = "BMW";
        String audi = "Audi";

        List<String> myArrListStrings = new ArrayList<>(10);//n*2/3
        myArrListStrings.add(bmw);
        myArrListStrings.add(audi);
        System.out.println(myArrListStrings);

        //Autoboxing из примитива делает объект
        Integer number =  new Integer(5);
        //Unboxing из объекта в примитив
        int unboxNumber =  number;

        ArrayList<Integer> myArrListIntegers =  new ArrayList<>();
        myArrListIntegers.add(100); // Autoboxing (компилятор преобразуе)примитив врапица в объект
        myArrListIntegers.add(200);
        myArrListIntegers.add(300);
        myArrListIntegers.add(4000);
        System.out.println(myArrListIntegers);
        myArrListIntegers.remove(2);
        System.out.println(myArrListIntegers);
        myArrListIntegers.add(2,300);
        System.out.println(myArrListIntegers);
        boolean isIn = myArrListIntegers.contains(300);
        System.out.println("Conteins: " + isIn);
        int arrSize = myArrListIntegers.size();
        System.out.println("Size: " + arrSize);
        boolean isEmptyArr = myArrListIntegers.isEmpty();
        System.out.println("Is Empty: " +  isEmptyArr);
        System.out.println("Which index has 300 value: " + myArrListIntegers.indexOf(300));
        System.out.println("Get second value: " + myArrListIntegers.get(1));
    }
}
