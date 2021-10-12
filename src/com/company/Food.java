package com.company;

public class Food implements Comparable{

    private String name;

    public Food(String dish) {
        name = dish;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "Dish='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
