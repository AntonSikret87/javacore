package com.karabeinikovAntonSikret87.app.homework.lesson14;

/**
 * Created by AntonKa on 5/8/2017.
 */
public class Rose extends Flowers {
    public Rose(double priceForOne, int flowerNumber, String flowerName) {
        super(priceForOne, flowerNumber, flowerName);
    }

    @Override
    public double countTotalPriceForFlower() {
        totalPrice = flowerNumber * priceForOne;
        System.out.println("Total price for roses is: " + totalPrice);
        return totalPrice;
    }
}
