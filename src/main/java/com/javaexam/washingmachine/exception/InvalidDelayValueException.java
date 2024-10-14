package com.javaexam.washingmachine.exception;

public class InvalidDelayValueException extends Exception {

    public InvalidDelayValueException() {
        super("Delay value cannot be negative.");
    }

}
