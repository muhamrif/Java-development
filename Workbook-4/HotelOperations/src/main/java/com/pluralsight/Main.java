package com.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Room room1 = new Room(2, 54, false, false);
        System.out.println(room1.isAvailable());
        System.out.println( LocalDate.now().getDayOfWeek().name());;


        Reservation res1 = new Reservation("king", LocalDate.now(), LocalDate.now().plusDays(3));

        System.out.println(res1.getReservationTotal());
    }
}
