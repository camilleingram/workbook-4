package com.pluralsight;

import java.time.LocalTime;

public class App {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel", 4, 3);
        hotel.bookRoom(3, true);
        System.out.println(" " + hotel.getAvailableSuites());

        Hotel hotel2 = new Hotel("Hotel", 10, 6);
        hotel2.bookRoom(7, true);
        System.out.println(" " + hotel2.getAvailableSuites());
    }
}
