package com.javaexam.washingmachine.exception;

import com.javaexam.washingmachine.domain.TemperatureUnit;

public class TemperatureUnitNotValidException extends Exception {
    public TemperatureUnitNotValidException() {
        super("Temparature unit can be either " + TemperatureUnit.CELSIUS.getUnit() + " or " + TemperatureUnit.FAHRENHEIT.getUnit());
    }
}
