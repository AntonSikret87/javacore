package com.karabeinikovAntonSikret87.app.classwork.lesson20.Generic;

import com.karabeinikovAntonSikret87.app.classwork.lesson20.ClassWorkGenerics.Compare;

/**
 * Created by AntonKa on 5/30/2017.
 */
public class OrderUtil {
    public static<K,V> boolean compare(Pair<K, V> op1, Pair<K,V> op2){
        return op1.getKey().equals(op2.getKey()) &&
                op1.getValue().equals(op2.getValue());
    }
    public static<K> boolean compare(Compare<K> o1, Compare<K> o2){
        return o1.getKey().equals(o2.getKey());
    }
}
