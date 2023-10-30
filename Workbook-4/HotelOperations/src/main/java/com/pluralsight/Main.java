package com.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Room room1 = new Room(2, 54, false, false);
        System.out.println(room1.isAvailable());
        System.out.println( LocalDate.now().getDayOfWeek().name());;
    }
}
