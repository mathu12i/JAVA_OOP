import it.utils.converter.*;

public class TestConversion {
    public static void main(String[] args) {
        TemperatureConversion temperatureConversion = new TemperatureConversion();

        System.out.println("5 Celsius to Fahrenheit: " + temperatureConversion.celsiusToFahrenheit(5));
        System.out.println("5 Celsius to Kelvin: " + temperatureConversion.celsiusToKelvin(5));
        System.out.println("*****************************************");
        System.out.println("5 Fahrenheit to Celsius: " + temperatureConversion.fahrenheitToCelsius(5));
        System.out.println("5 Fahrenheit to kelvin: " + temperatureConversion.fahrenheitToKelvin(5));
        System.out.println("*****************************************");
        System.out.println("5 Kelvin to Celsius: " + temperatureConversion.kelvinToCelsius(5));
        System.out.println("5 Kelvin to Fahrenheit: " + temperatureConversion.kelvinToFahrenheit(5));
    }
}
