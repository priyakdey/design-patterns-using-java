package com.priyakdey.design.patterns.structural.facade.example1;

import java.time.LocalDate;

/**
 * @author Priyak Dey
 * @since 10-06-2022
 */
public class CarRental {

    public void book(LocalDate start, LocalDate end) {
        System.out.printf("Your car rental booking is done from %s to %s\n", start, end);
    }

}
