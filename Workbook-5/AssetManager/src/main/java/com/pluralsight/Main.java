package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cash cash = new Cash("cash", "today", 55);

        System.out.println( cash.getValue());
        Scanner input = new Scanner(System.in);
        input.nextLine();


    }
}
