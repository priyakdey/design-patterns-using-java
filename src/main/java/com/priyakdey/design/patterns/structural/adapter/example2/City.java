package com.priyakdey.design.patterns.structural.adapter.example2;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public interface City {

    String getName();
    double getTemperature();
    String getTemperatureScale();
    boolean getHasWeatherWarning();
    void setHasWeatherWarning(boolean hasHasWeatherWarning);

}
