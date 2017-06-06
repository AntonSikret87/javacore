package com.karabeinikovAntonSikret87.app.classwork.lesson20;

/**
 * Created by AntonKa on 5/30/2017.
 */
public class BoxPrinterGeneric<T> { //дюбой класс любой тип
    private T val;

    @Override
    public String toString() {
        return "{" +
                "val=" + val +
                '}';
    }

    public T getVal() {
        return val;
    }


    public BoxPrinterGeneric(T val) {
        this.val = val;
    }



    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> boxPrinter = new BoxPrinterGeneric<>(10);
        System.out.println(boxPrinter);
        Integer integer =  boxPrinter.getVal();

        BoxPrinterGeneric<String> boxPrinter1 = new BoxPrinterGeneric<>("Hello");
        System.out.println(boxPrinter1);
        String string1 = boxPrinter1.getVal();

        BoxPrinterGeneric<Long> boxPrinter2 = new BoxPrinterGeneric<>(200l);
        Long long1 = boxPrinter2.getVal();
        System.out.println(boxPrinter2);
    }
}
