package com.priyakdey.design.patterns.structural.adapter;

import java.math.BigDecimal;

/**
 * This helps us adapt from {@link UKEmployee} to {@link Employee} type for clients to use.
 *
 * We need to expose the similar contract - hence implement/extend the class you are adapting to.
 * We need to change/modify the behaviour of a class, adapt from  - hence composition
 *
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class UKEmployeeAdapter extends Employee {
    // private UKEmployee ukEmployee; -- This is not required for our case, we accept in init() and transform/adapt

    protected UKEmployeeAdapter(UKEmployee ukEmployee) {
        super(ukEmployee.id, ukEmployee.firstName + " " + ukEmployee.firstName, BigDecimal.valueOf(ukEmployee.payPerHour));
    }

    @Override
    public BigDecimal getPayPerHour() {
        // Get the pay per hour
        BigDecimal payPerHour = super.payPerHour;
        // Maybe make a call for conversion
        return payPerHour.multiply(BigDecimal.valueOf(97.7));
    }
}
