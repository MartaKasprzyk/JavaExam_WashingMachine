package com.javaexam.washingmachine;

import com.javaexam.washingmachine.domain.LaundryProgram;
import com.javaexam.washingmachine.domain.WashingMachine;
import com.javaexam.washingmachine.exception.*;
import com.javaexam.washingmachine.service.LaundryProgramGenerator;

import java.util.List;

public class Main {
    public static void main(String[] args) throws SpeedOutOfRangeException, TemperatureUnitNotValidException, TemperatureOutOfRangeException, InvalidDelayValueException, InvalidProgramException {

        // generate list of laundry programs
        LaundryProgramGenerator generator = new LaundryProgramGenerator();
        List<LaundryProgram> programs = generator.createLaundryPrograms(10);

        // create new Washing Machine
        WashingMachine machine = new WashingMachine(programs);
//        machine.showStatus();
//        machine.showHistory();

        // set new Laundry
        machine.setNewLaundry();
        machine.showStatus();

        // modify Laundry
//        machine.tempUp();
//        machine.showStatus();

//        machine.tempDown();
//        machine.showStatus();

//        machine.convertTemp();
//        machine.showStatus();

//        machine.speedUp();
//        machine.showStatus();

//        machine.speedDown();
//        machine.showStatus();
//
//        machine.speedUp();
//        machine.showStatus();

//        // change program
//        machine.nextProgram();
//        machine.showStatus();

//        machine.previousProgram();
//        machine.showStatus();

//        machine.setProgram(programs.get(3));
//        machine.showStatus();

//        machine.setLaundryDelay(15);
//        machine.showStatus();

//        // do laundry -> save to history
//        machine.doLaundry();
//        machine.showHistory();
//        machine.showStatus();
//
//        // check list of all programs for WM
//        System.out.println(machine.getPrograms());

    }
}