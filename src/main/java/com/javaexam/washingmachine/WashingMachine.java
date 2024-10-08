package com.javaexam.washingmachine;

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
