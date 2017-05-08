package com.karabeinikovAntonSikret87.app.homework.lesson14;

/**
 * Created by AntonKa on 5/8/2017.
 */
public class Tulip extends Flowers {
    public Tulip(double priceForOne, int flowerNumber, String flowerName) {
        super(priceForOne, flowerNumber, flowerName);
    }

    @Override
    public double countTotalPriceForFlower() {
        setTotalPrice(getPriceForOne() * getFlowerNumber());
        System.out.println("Total price for " + getFlowerName() + " is: " + getTotalPrice());
        return getTotalPrice();
    }
}
