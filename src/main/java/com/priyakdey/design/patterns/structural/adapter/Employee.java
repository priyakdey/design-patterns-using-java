package com.priyakdey.design.patterns.structural.adapter;

import java.math.BigDecimal;

/**
 * @author Priyak Dey
 * @since 07-06-2022
 */
public abstract class Employee {
    protected final String id;
    protected final String name;
    protected final BigDecimal payPerHour;

    protected Employee(String id, String name, BigDecimal payPerHour) {
        this.id = id;
        this.name = name;
        this.payPerHour = payPerHour;
    }

    public abstract BigDecimal getPayPerHour();
}
