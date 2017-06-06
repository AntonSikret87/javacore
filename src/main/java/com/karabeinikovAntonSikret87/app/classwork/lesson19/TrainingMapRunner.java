package com.karabeinikovAntonSikret87.app.classwork.lesson19;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AntonKa on 5/26/2017.
 */
public class TrainingMapRunner {
    public static void main(String[] args) {
        TrainingMap kit = new TrainingMap();
        kit.name = "KIT";

        TrainingMap bio = new TrainingMap();
        bio.name = "BIO";

        TrainingMap google = new TrainingMap();
        google.name = "GOO";

        TrainingMap yandex = new TrainingMap();
        yandex.name = "YAN";

        Map<TrainingMap, Integer> map = new HashMap(32);
        map.put(kit, 13);
        map.put(bio, 12);
        map.put(google, 100);
        map.put(yandex, 99);
        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.get(bio));
        System.out.println(map.containsKey(bio));

        for(Map.Entry<TrainingMap, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
