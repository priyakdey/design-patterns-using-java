package com.priyakdey.design.patterns.structural.adapter.example2;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class NorthAmericanCity implements City {

    private final String name;
    private final double temperature;
    private boolean hasHasWeatherWarning;

    public NorthAmericanCity(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return hasHasWeatherWarning;
    }

    @Override
    public void setHasWeatherWarning(boolean hasHasWeatherWarning) {
        this.hasHasWeatherWarning = hasHasWeatherWarning;
    }
}
