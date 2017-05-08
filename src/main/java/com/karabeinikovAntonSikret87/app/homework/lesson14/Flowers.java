package com.karabeinikovAntonSikret87.app.homework.lesson14;

/**
 * Created by AntonKa on 5/8/2017.
 */
public class Flowers {
    public double priceForOne;
    public int flowerNumber;
    public double totalPrice;
    public String flowerName;

    public Flowers(double priceForOne, int flowerNumber, String flowerName) {
        this.priceForOne = priceForOne;
        this.flowerNumber = flowerNumber;
        this.flowerName = flowerName;
    }
    public double countTotalPriceForFlower(){
        totalPrice = flowerNumber * priceForOne;
        System.out.println("Total price for flowers is: " + totalPrice);
        return totalPrice;
    }
}
