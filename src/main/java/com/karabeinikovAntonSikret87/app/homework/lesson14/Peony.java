package com.karabeinikovAntonSikret87.app.homework.lesson14;

/**
 * Created by AntonKa on 5/8/2017.
 */
public class Peony extends Flowers {
    public Peony(double priceForOne, int flowerNumber, String flowerName) {
        super(priceForOne, flowerNumber, flowerName);
    }

    @Override
    public double countTotalPriceForFlower() {
        totalPrice = flowerNumber * priceForOne;
        System.out.println("Total price for peony is: " + totalPrice);
        return totalPrice;
    }
}
