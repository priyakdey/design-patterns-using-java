package com.priyakdey.design.patterns.structural.facade.example1;

import java.time.LocalDate;

/**
 * @author Priyak Dey
 * @since 10-06-2022
 */
public class Flight {

    public void bookOnwardJourney(LocalDate date) {
        System.out.printf("Your onward flight is booked for %s\n",date);
    }

    public void bookReturnJourney(LocalDate date) {
        System.out.printf("Your return flight is booked for %s\n",date);
    }

}
