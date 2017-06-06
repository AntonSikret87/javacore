package com.karabeinikovAntonSikret87.app.classwork.lesson19;

/**
 * Created by AntonKa on 5/26/2017.
 */
public class TrainingMap {
    public String name;


    @Override
    public String toString() {
        return "TrainingMap{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrainingMap)) return false;

        TrainingMap that = (TrainingMap) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        if(this.name.length()%2 ==0)
            return 31;
        else
            return 95;
    }
}
