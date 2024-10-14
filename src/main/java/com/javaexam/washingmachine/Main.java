package com.javaexam.washingmachine;

import com.javaexam.washingmachine.domain.Beko;
import com.javaexam.washingmachine.domain.LaundryProgram;
import com.javaexam.washingmachine.domain.LaundryRecord;
import com.javaexam.washingmachine.exception.*;
import com.javaexam.washingmachine.service.LaundryProgramGenerator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws SpeedOutOfRangeException, TemperatureUnitNotValidException, TemperatureOutOfRangeException, InvalidDelayValueException, InvalidProgramException, InvalidWeightException {

        // generate list of laundry programs
        LaundryProgramGenerator generator = new LaundryProgramGenerator();
        List<LaundryProgram> programs = generator.createLaundryPrograms(10);

        // create new Washing Machine
//        WashingMachine machine = new WashingMachine(programs);
//        machine.showStatus();
//        machine.showHistory();
//
//        // set new Laundry
//        machine.setNewLaundry();
//        machine.showStatus();
//
//        // modify Laundry
//        machine.tempUp();
//        machine.showStatus();
//
//        machine.tempDown();
//        machine.showStatus();
//
//        machine.convertTemp();
//        machine.showStatus();
//
//        machine.speedUp();
//        machine.showStatus();
//
//        machine.speedDown();
//        machine.showStatus();
//
//        machine.speedUp();
//        machine.showStatus();
//
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
//
//        machine.setLaundryDelay(15);
//        machine.showStatus();
//
//       // do laundry -> save to history
//        machine.doLaundry();
//        machine.showHistory();
//        machine.showStatus();
//
//        // check list of all programs for WM
//        machine.printPrograms();

//        // test history - 30 records
//        machine.setNewLaundry();
//        machine.showStatus();
//        machine.doLaundry();
//        machine.showHistory();
//        machine.showStatus();
//
//        // change program
//        machine.nextProgram();
//        machine.setNewLaundry();
//        machine.showStatus();
//        machine.doLaundry();
//
//        for (int i = 0; i < 29; i++){
//            machine.setNewLaundry();
//            machine.doLaundry();
//        }
//
//        machine.showHistory();


        // BEKO
//        Beko beko = new Beko(programs, 7);

//        beko.showStatus();
//        beko.showHistory();

        // set new Laundry
//        beko.setNewLaundry();
//        beko.showStatus();

        // set weight, check capacity, call expected laundry duration
//        beko.setCurrentWeight(5.0);
//        beko.getCurrentWeight();
//        beko.checkCurrentCapacity();
//        beko.calculateLaundryDuration();
//        beko.showStatus();
//
//        // modify Laundry
//        beko.tempUp();
//        beko.showStatus();
//
//        beko.tempDown();
//        beko.showStatus();
////
//        beko.convertTemp();
//        beko.showStatus();
//
//        beko.tempUp();
//        beko.showStatus();
////
//        beko.tempDown();
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

        // AMICA
//        Amica amica = new Amica(programs, 5);

//        amica.showStatus();
//        amica.showHistory();

        // set new Laundry
//        amica.setNewLaundry();
//        amica.showStatus();

        // set weight, check capacity, call expected laundry duration
//        amica.setCurrentWeight(5.0);
//        amica.getCurrentWeight();
//        amica.checkCurrentCapacity();
//        amica.calculateLaundryDuration();
//        amica.showStatus();
//
//        // modify Laundry
//        amica.tempUp();
//        amica.showStatus();
////
//        amica.tempDown();
//        amica.showStatus();
////
//        amica.convertTemp();
//        amica.showStatus();
//
//        amica.tempUp();
//        amica.showStatus();
////
//        amica.tempDown();
//        amica.showStatus();

//        amica.speedUp();
//        amica.showStatus();

//        amica.speedDown();
//        amica.showStatus();
//
//        amica.speedUp();
//        amica.showStatus();

        // change program
//        amica.nextProgram();
//        amica.showStatus();
//
//        amica.setNewLaundry();
//        amica.showStatus();
//
//        amica.previousProgram();
//        amica.showStatus();
//
//        amica.setNewLaundry();
//        amica.showStatus();
//
//        amica.setProgram(programs.get(3));
//        amica.showStatus();
//
//        amica.setNewLaundry();
//        amica.showStatus();

        // do laundry -> save to history
//        amica.doLaundry();
//        amica.showHistory();
//        amica.showStatus();
//
//        // check list of all programs for WM
//        amica.printPrograms();

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

        // test optimize
        Beko beko = new Beko(programs, 7);
        beko.setNewLaundry();
        beko.tempUp();
        beko.setCurrentWeight(1);
        beko.speedDown();
        beko.speedDown();
        beko.doLaundry();
        beko.setNewLaundry();
        beko.setCurrentWeight(5);
        beko.speedDown();
        beko.doLaundry();
        beko.setNewLaundry();
        beko.tempUp();
        beko.tempUp();
        beko.setCurrentWeight(2);
        beko.doLaundry();

        beko.nextProgram();
        beko.setNewLaundry();
        beko.tempUp();
        beko.setCurrentWeight(1);
        beko.speedDown();
        beko.speedDown();
        beko.doLaundry();
        beko.setNewLaundry();
        beko.setCurrentWeight(5);
        beko.speedDown();
        beko.doLaundry();
        beko.setNewLaundry();
        beko.tempUp();
        beko.tempUp();
        beko.setCurrentWeight(2);
        beko.doLaundry();

        beko.nextProgram();
        beko.setNewLaundry();
        beko.tempUp();
        beko.setCurrentWeight(1);
        beko.speedDown();
        beko.speedDown();
        beko.doLaundry();

//        beko.setNewLaundry();
//        beko.tempUp();
//        beko.setCurrentWeight(6);
//        beko.speedDown();
//        beko.speedDown();
//        beko.doLaundry();
//        beko.setNewLaundry();
//        beko.setCurrentWeight(6);
//        beko.speedDown();
//        beko.doLaundry();
//        beko.setNewLaundry();
//        beko.tempUp();
//        beko.tempUp();
//        beko.setCurrentWeight(6);
//        beko.doLaundry();

        beko.showHistory();

        optimize(beko.getHistory().getLaundryHistory());
    }

    public static void optimize(List<LaundryRecord> laundryHistory) {
        boolean unoptimizable = laundryHistory.stream().allMatch(record -> record.capacity > 51);
        if (unoptimizable) {
            System.out.println("Laundry is impossible to optimize");
        } else {
            Map<String, List<LaundryRecord>> recordsByProgram = laundryHistory.stream()
                    .collect(Collectors.groupingBy(record -> record.program.getProgramName()));

            recordsByProgram.forEach((programName, records) -> {
                long count = records.stream().filter(record -> record.capacity < 51).count();
                if (count > 1) {
                    Double lowestTemp = records.stream().map(record -> record.temp).sorted().findFirst().get();
                    Integer lowestSpeed = records.stream().map(record -> record.speed).sorted().findFirst().get();

                    System.out.println("Zaoszczędziłbyś piorąc rzadziej programem " + programName +
                            " w temperaturze " + lowestTemp + " i o obrotach " + lowestSpeed);

                }
            });
        }
    }

}