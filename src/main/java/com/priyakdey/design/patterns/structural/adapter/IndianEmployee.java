package com.priyakdey.design.patterns.structural.adapter;

import java.math.BigDecimal;

/**
 * @author Priyak Dey
 * @since 07-06-2022
 */
public class IndianEmployee extends Employee {
    public IndianEmployee(String id, String name, BigDecimal payPerHour) {
        super(id, name, payPerHour);
    }

    @Override
    public BigDecimal getPayPerHour() {
        return payPerHour;
    }
}
