package com.javaexam.washingmachine.exception;

public class TemperatureUnitNotValidException extends Exception {
    public TemperatureUnitNotValidException() {
        super("Temparature unit can be either " + TemperatureUnit.CELSIUS.getUnit() + " or " + TemperatureUnit.FAHRENHEIT.getUnit());
    }
}
