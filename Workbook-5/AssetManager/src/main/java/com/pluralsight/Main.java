package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cash cash = new Cash("cash", "today", 55);
        Vehicle vehicle = new Vehicle("car", "today", 10000, "toyota", 2010, 100000);
        House house = new House("house", "today", 100000, "1234", 1, 1000, 10000);

        System.out.println( cash.getValue());
        System.out.println( vehicle.getValue());
        cash.getValue();

    }






}
