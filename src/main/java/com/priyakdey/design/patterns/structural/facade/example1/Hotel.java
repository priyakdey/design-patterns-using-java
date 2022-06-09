package com.priyakdey.design.patterns.structural.facade.example1;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Priyak Dey
 * @since 10-06-2022
 */
public class Hotel {

    public void book(LocalDate start, LocalDate end) {
        System.out.printf("Your hotel booking is done from %s to %s\n", start, end);
    }

}
