package com.priyakdey.design.patterns.structural.adapter.example1;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

import static java.math.BigDecimal.valueOf;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class AdapterDemo {

    public static void main(String[] args) {
        // Calculate the pay for employee 1 and 2
        // pay per hour is in Rs by default since we started with a local company
        final Employee emp1 = new IndianEmployee("1000", "emp1", valueOf(500L));
        final Employee emp2 = new IndianEmployee("2000", "emp2", valueOf(450L));

        // calculate monthly expense as salary for the employees
        final var payrollCalculator = new ExpenseCalculator();
        BigDecimal salaryForEmp1 = payrollCalculator.calculateSalaryExpenseForEmployee(emp1);
        BigDecimal salaryForEmp2 = payrollCalculator.calculateSalaryExpenseForEmployee(emp2);

        System.out.println("salaryForEmp1 = " + salaryForEmp1);
        System.out.println("salaryForEmp2 = " + salaryForEmp2);

        System.out.printf("Total expense for all employees = %s\n", salaryForEmp1.add(salaryForEmp2));


        // now we merged with a different company from UK, and they had UKEmployee with a completely different structure
        // We can definitely have a salary system for them, but for overall expense management we are
        // still trying to use this one without opening the ExpenseCalculator#calculateSalaryExpenseForEmployee() code.
        // so lets try and incorporate and Adapter so that our expense calculator still works with this old model/different model

        final var currency = Currency.getInstance(Locale.UK);
        final UKEmployee employee3 = new UKEmployee("4000", "FirstName", "LastName", currency, 30);

        // Now ExpenseCalculator#calculateSalaryExpenseForEmployee expects a Employee
        // so we use the adapter
        UKEmployeeAdapter ukEmployeeAdapter = new UKEmployeeAdapter(employee3);

        BigDecimal salaryForEmp3 = payrollCalculator.calculateSalaryExpenseForEmployee(ukEmployeeAdapter);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Big dreams ! We have bought a company in UK and now need to work with their legacy system");
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("salaryForEmp3 = " + salaryForEmp3);

        System.out.printf("Total expense for all employees = %s\n", salaryForEmp1.add(salaryForEmp2).add(salaryForEmp3));


    }
}
