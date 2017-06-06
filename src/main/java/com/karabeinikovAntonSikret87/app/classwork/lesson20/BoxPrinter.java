package com.karabeinikovAntonSikret87.app.classwork.lesson20;

/**
 * Created by AntonKa on 5/30/2017.
 */
public class BoxPrinter {
    private Object val;
    @Override
    public String toString() {
        return "{" +
                "val=" + val +
                '}';
    }

    public Object getVal() {
        return val;
    }


    public BoxPrinter(Object val){
        this.val = val;
    }

    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter(10);
        System.out.println(boxPrinter);
        Integer integer = (Integer) boxPrinter.getVal();
        System.out.println(integer);

        BoxPrinter boxPrinter1 = new BoxPrinter("Hello");
        System.out.println(boxPrinter1);
        Integer integer2 = (Integer) boxPrinter1.getVal();
        System.out.println(integer2);

        BoxPrinter boxPrinter3 = new BoxPrinter(100l);
        System.out.println(boxPrinter3);
        Integer integer3 = (Integer)boxPrinter3.getVal();
        System.out.println(integer3);
    }
}
