package com.priyakdey.design.patterns.structural.adapter.example2;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public record CityTempAdapter(City city) implements City {

    @Override
    public String getName() {
        return city.getName();
    }

    @Override
    public double getTemperature() {
        final var tempInCelsius = city.getTemperature();
        return (tempInCelsius * 1.80) + 32.00;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasHasWeatherWarning) {
        city.setHasWeatherWarning(hasHasWeatherWarning);
    }
}
