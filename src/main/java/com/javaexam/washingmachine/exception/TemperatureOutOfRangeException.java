package com.javaexam.washingmachine.exception;

public class TemperatureOutOfRangeException extends Exception {
    public TemperatureOutOfRangeException() {
        super("Temperature out of range");
    }
}
