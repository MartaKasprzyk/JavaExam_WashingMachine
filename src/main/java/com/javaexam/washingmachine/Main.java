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
//
//        machine.setNewLaundry();
//        machine.showStatus();
//
//        machine.previousProgram();
//        machine.showStatus();
//
//        machine.setNewLaundry();
//        machine.showStatus();
//
//        machine.setProgram(programs.get(3));
//        machine.showStatus();
//
//        machine.setNewLaundry();
//        machine.showStatus();

//        machine.setLaundryDelay(15);
//        machine.showStatus();

//        // do laundry -> save to history
//        machine.doLaundry();
//        machine.showHistory();
//        machine.showStatus();
//
//        // check list of all programs for WM
//        machine.printPrograms();


        // BEKO
//        Beko beko = new Beko(programs);

//        beko.showStatus();
//        beko.showHistory();

        // set new Laundry
//        beko.setNewLaundry();
//        beko.showStatus();

        // modify Laundry
//        beko.tempUp();
//        beko.showStatus();
//
//        beko.tempDown();
//        beko.showStatus();
//
//        beko.convertTemp();
//        beko.showStatus();

//        beko.speedUp();
//        beko.showStatus();

//        beko.speedDown();
//        beko.showStatus();
//
//        beko.speedUp();
//        beko.showStatus();

        // change program
//        beko.nextProgram();
//        beko.showStatus();
//
//        beko.setNewLaundry();
//        beko.showStatus();
//
//        beko.previousProgram();
//        beko.showStatus();
//
//        beko.setNewLaundry();
//        beko.showStatus();
//
//        beko.setProgram(programs.get(3));
//        beko.showStatus();
//
//        beko.setNewLaundry();
//        beko.showStatus();

        // do laundry -> save to history
//        beko.doLaundry();
//        beko.showHistory();
//        beko.showStatus();
//
//        // check list of all programs for WM
//        beko.printPrograms();

        // Whirpool
//        List<LaundryProgram> programs15 = generator.createLaundryPrograms(15);
//        Whirpool whirpool = new Whirpool(programs15);

//        whirpool.showStatus();
//        whirpool.showHistory();

        // set new Laundry
//        whirpool.setNewLaundry();
//        whirpool.showStatus();

        // modify Laundry
//        whirpool.tempUp();
//        whirpool.showStatus();
//
//        whirpool.tempDown();
//        whirpool.showStatus();
//
//        whirpool.convertTemp();
//        whirpool.showStatus();

//        whirpool.speedUp();
//        whirpool.showStatus();

//        whirpool.speedDown();
//        whirpool.showStatus();
//
//        whirpool.speedUp();
//        whirpool.showStatus();

//        // change program
//        whirpool.nextProgram();
//        whirpool.showStatus();
//
//        whirpool.setNewLaundry();
//        whirpool.showStatus();
//
//        whirpool.previousProgram();
//        whirpool.showStatus();
//
//        whirpool.setNewLaundry();
//        whirpool.showStatus();
//
//        whirpool.setProgram(programs.get(3));
//        whirpool.showStatus();
//
//        whirpool.setNewLaundry();
//        whirpool.showStatus();

        // do laundry -> save to history
//        whirpool.doLaundry();
//        whirpool.showHistory();
//        whirpool.showStatus();
//
        // check list of all programs for WM
//        whirpool.printPrograms();

    }
}