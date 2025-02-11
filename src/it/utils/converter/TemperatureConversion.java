package it.utils.converter;

public class TemperatureConversion implements TemperatureConverter {

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitToKelvin(double fahrenheit) {
        return (((fahrenheit - 32) * 5) / 9) + 273;
    }

    @Override
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273;
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (5 * (fahrenheit - 32)) / 9;
    }

    @Override
    public double kelvinToFahrenheit(double kelvin) {
        return (9 * (kelvin - 273.15)) / 5;
    }

}
