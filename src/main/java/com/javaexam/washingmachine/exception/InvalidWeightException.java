package com.javaexam.washingmachine.exception;

public class InvalidWeightException extends Exception {
    public InvalidWeightException() {
        super("Weight should be <= 0.");
    }
}
