package com.priyakdey.design.patterns.structural.adapter.example1;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

/**

 *
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class ExpenseCalculator {

    public BigDecimal calculateSalaryExpenseForEmployee(Employee employee) {
        return employee.getPayPerHour().multiply(valueOf(22L)).multiply(valueOf(8L));
    }

}
