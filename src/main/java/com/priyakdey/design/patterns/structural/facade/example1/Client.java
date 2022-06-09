package com.priyakdey.design.patterns.structural.facade.example1;

import java.time.LocalDate;

/**
 * @author Priyak Dey
 * @since 10-06-2022
 */
public class Client {

    public static void main(String[] args) {
        // I am going on a vacation and do I all !

        LocalDate startDate = LocalDate.of(2022, 7, 10);
        LocalDate endDate   = LocalDate.of(2022, 7, 21);

        Flight flight = new Flight();
        flight.bookOnwardJourney(startDate);
        flight.bookReturnJourney(endDate);

        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);

        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);

    }

}
