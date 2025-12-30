package week6workshop.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import week6workshop.TemperatureConverter;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
    }
}
