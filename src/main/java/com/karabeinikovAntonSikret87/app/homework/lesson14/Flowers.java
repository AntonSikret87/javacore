package com.karabeinikovAntonSikret87.app.homework.lesson14;

/**
 * Created by AntonKa on 5/8/2017.
 */
public class Flowers {
    private double priceForOne;
    private int flowerNumber;
    private double totalPrice;
    private String flowerName;

    public Flowers(double priceForOne, int flowerNumber, String flowerName) {
        this.setPriceForOne(priceForOne);
        this.setFlowerNumber(flowerNumber);
        this.setFlowerName(flowerName);
    }

    public double getPriceForOne() {
        return priceForOne;
    }

    public void setPriceForOne(double priceForOne) {
        this.priceForOne = priceForOne;
    }

    public int getFlowerNumber() {
        return flowerNumber;
    }

    public void setFlowerNumber(int flowerNumber) {
        this.flowerNumber = flowerNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public double countTotalPriceForFlower(){
        setTotalPrice(getPriceForOne() * getFlowerNumber());
        //    totalPrice = flowerNumber * priceForOne;
        System.out.println("Total price for flowers is: " + getTotalPrice());
        return getTotalPrice();
    }
}
