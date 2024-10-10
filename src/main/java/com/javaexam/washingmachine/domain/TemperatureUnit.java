package com.javaexam.washingmachine.domain;

public enum TemperatureUnit {
    CELSIUS("\u00B0C"),
    FAHRENHEIT("F");

    private final String unit;

    TemperatureUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}
