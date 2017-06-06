package com.karabeinikovAntonSikret87.app.classwork.lesson18.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by AntonKa on 5/23/2017.
 */
public class Hashmap1 {
    public static void main(String[] args) {
        Map map1 = new HashMap(16);
        map1.put("Anton", 30);
        map1.put("Anton", 31);
        map1.put(45, "Baba jagodka opjat'");
        map1.put(99, "Spasibo chto zhuvoj");
        map1.put(69, "Fish");
//        System.out.println(map1.get(99));
//        System.out.println(map1.get("Anton"));
//        System.out.println(" Map elements:");
//        System.out.print("\t" + map1);

        Map map2 = new HashMap<>();
        map2.put("KIT", 13);
        map2.put("Ciklum", 15);
        Set entries =  map2.entrySet();
        System.out.println(entries);
        Set keys =  map2.keySet();
        System.out.println(keys);
        System.out.println(map2.containsKey("Ciklum"));





    }
}
