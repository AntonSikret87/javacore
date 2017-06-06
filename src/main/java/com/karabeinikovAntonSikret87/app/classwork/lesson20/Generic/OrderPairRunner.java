package com.karabeinikovAntonSikret87.app.classwork.lesson20.Generic;

/**
 * Created by AntonKa on 5/30/2017.
 */
public class OrderPairRunner {
    public static void main(String[] args) {
        Pair<String, Integer> orderPair1 = new OrderPair<>("Even", 4);
        Pair<String, Integer> orderPair2 = new OrderPair<>("Odd", 3);

        Pair<Integer, Integer> orderPair3 = new OrderPair<>(16, 3);
        Pair<Integer, Integer> orderPair4 = new OrderPair<>(22, 3);

        boolean same  = OrderUtil.compare(orderPair1,orderPair2);
        System.out.println(same);
        boolean same1  = OrderUtil.compare(orderPair2,orderPair2);
        System.out.println(same1);

        boolean same3 = OrderUtil.compare(orderPair3,orderPair4);
        System.out.println(same3);

    }
}
