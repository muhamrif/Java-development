package com.pluralsight;

public class Main {
    public static void main(String[] args) {
    FixedList<Integer> list1 = new FixedList<>(2);
    list1.add(1);
        list1.add(1);
        list1.add(1);

        System.out.println(list1.getItems());

    }
}
