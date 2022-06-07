package com.priyakdey.design.patterns.structural.adapter.example2;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class WeatherWarnings {
    public static final double MAX_TEMPERATURE = 100;
    public static final double MIN_TEMPERATURE = 30;        // these are in Fahrenheit

    public void postWarning(City city) {
        if (city.getTemperature() >= MAX_TEMPERATURE || city.getTemperature() <= MIN_TEMPERATURE) {
            System.out.printf(
                    "Warning !!! Current temperature in %s is %1.1f %s\n",
                    city.getName(),
                    city.getTemperature(),
                    city.getTemperatureScale()
            );
        } else {
            System.out.printf(
                    "Temperature is OK in %s. Today's temperature is %1.1f %s...\n",
                    city.getName(),
                    city.getTemperature(),
                    city.getTemperatureScale()
            );
        }
    }


}
