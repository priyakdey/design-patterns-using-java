package com.priyakdey.design.patterns.structural.adapter.example2;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class Main {

    public static void main(String[] args) {
        final var weatherWarnings = new WeatherWarnings();

        final var chicago = new NorthAmericanCity("Chicago", 16);
        weatherWarnings.postWarning(chicago);

        final var phoenix = new NorthAmericanCity("Phoenix", 104);
        weatherWarnings.postWarning(phoenix);

        final var portland = new NorthAmericanCity("Portland", 70);
        weatherWarnings.postWarning(portland);

        final var bangkok = new AsianCity("Bangkok", 50);
        weatherWarnings.postWarning(new CityTempAdapter(bangkok));

    }

}
