package com.javaexam.washingmachine.domain;

import com.javaexam.washingmachine.AvailablePrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class WashingMachine implements Program {
    private int programNumber;
    private String programName;

    ArrayList<AvailablePrograms> availableProgramsValues = new ArrayList<>(Arrays.asList(AvailablePrograms.values()));

    public int getProgram() {
        return programNumber;
    }

    public void setProgram(int programNumber) {
        boolean programAllowed = checkIfProgramAllowed(programNumber);

        if (programAllowed) {
            this.programNumber = programNumber;
            this.programName = getNameByValue(programNumber);
        } else {
            throw new IllegalArgumentException("Invalid program number.");
        }
    }

    @Override
    public int nextProgram() {
        int nextProgram = 0;
        int currentProgram = getProgram();
        boolean programAllowed = checkIfProgramAllowed(currentProgram);

        if (programAllowed) {
            int index = getIndex(currentProgram);

            if (currentProgram == 10) {
                nextProgram = availableProgramsValues.get(0).getAvailableProgram();
            } else {
                if (currentProgram >= 1 && currentProgram < 10) {
                    nextProgram = availableProgramsValues.get(index + 1).getAvailableProgram();
                } else {
                    System.out.println("Sth went wrong");
                }
            }
        } else {
            nextProgram = -1;
        }
        return nextProgram;
    }

    @Override
    public int previousProgram() {
        int previousProgram = 0;
        int currentProgram = getProgram();
        boolean programAllowed = checkIfProgramAllowed(currentProgram);

        if (programAllowed) {
            int index = getIndex(currentProgram);

            if (currentProgram == 1) {
                previousProgram = availableProgramsValues.get(9).getAvailableProgram();
            } else {
                if (currentProgram > 1 && currentProgram <= 10) {
                    previousProgram = availableProgramsValues.get(index - 1).getAvailableProgram();
                } else {
                    System.out.println("Sth went wrong");
                }
            }
        } else {
            previousProgram = -1;
        }
        return previousProgram;
    }

    private int getIndex(int programNumber) {
        int index = -1;
        for (int i = 0; i < availableProgramsValues.size(); i++) {
            if (availableProgramsValues.get(i).getAvailableProgram() == programNumber) {
                index = i;
                break;
            }
        }
        return index;
    }

    private boolean checkIfProgramAllowed(int programNumber) {
        for (AvailablePrograms program : AvailablePrograms.values()) {
            if (program.getAvailableProgram() == programNumber) {
                return true;
            }
        }
        return false;
    }

    private String getNameByValue(int programNumber){

        for (AvailablePrograms programName : AvailablePrograms.values()){
            if (programName.getAvailableProgram() == programNumber) {
                return programName.toString();
            }
        }
        throw new IllegalArgumentException("Invalid program number");
    }
}
