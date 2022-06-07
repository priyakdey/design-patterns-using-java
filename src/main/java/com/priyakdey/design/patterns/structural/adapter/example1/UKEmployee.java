package com.priyakdey.design.patterns.structural.adapter.example1;

import java.util.Currency;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class UKEmployee {
    protected final String id;
    protected final String firstName;
    protected final String lastName;
    protected final Currency currency;
    protected final Integer payPerHour;


    public UKEmployee(String id, String firstName, String lastName, Currency currency, Integer payPerHour) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currency = currency;
        this.payPerHour = payPerHour;
    }
}
