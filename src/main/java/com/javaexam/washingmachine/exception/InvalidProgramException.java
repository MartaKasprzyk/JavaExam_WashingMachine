package com.javaexam.washingmachine.exception;

public class InvalidProgramException extends Exception {

    public InvalidProgramException() {
        super("Program you are trying to set is not allowed.");
    }

}
