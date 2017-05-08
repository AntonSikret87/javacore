package com.karabeinikovAntonSikret87.app.homework.lesson14;

/**
 * Created by AntonKa on 5/8/2017.
 */
public class FlowerRunner {
    private static double totalPriceForOneTypeFlower;
    public static void main(String[] args) {

        Flowers rose = new Rose(20.0 ,3,"Rose");
    //     rose.countTotalPriceForFlower();
        Flowers peony = new Peony(20,2,"Peony");
    //    peony.countTotalPriceForFlower();
        Flowers tulip = new Tulip(16.5, 6, "Tulips");
    //    tulip.countTotalPriceForFlower();

//        countTotalPrice(tulip);
//        countTotalPrice(rose);
//        countTotalPrice(peony);

        Flowers[] flowers = new Flowers[3];
        flowers[0] = rose;
        flowers[1] = peony;
        flowers[2] = tulip;
        countTotalPriceAllFlower(flowers);


    }
    public static double countTotalPrice(Flowers flowers){
        totalPriceForOneTypeFlower = flowers.countTotalPriceForFlower();
        return totalPriceForOneTypeFlower;
    }

    public static void countTotalPriceAllFlower(Flowers[] flowers){
        double result = 0.0;
        for(int i = 0 ; i < flowers.length; i++) {
                double totalPriceForOneTypeFlower = countTotalPrice(flowers[i]);
                result += totalPriceForOneTypeFlower;
            }
        System.out.println("Total price for buqet is: " + result);
    }
}
