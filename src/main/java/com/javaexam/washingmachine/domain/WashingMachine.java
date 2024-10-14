package com.javaexam.washingmachine.domain;

import com.javaexam.washingmachine.exception.*;
import org.json.JSONObject;

import java.util.List;

public class WashingMachine {
    private List<LaundryProgram> programs;
    protected LaundryProgram currentProgram;
    protected Laundry currentLaundry;
    protected LaundryHistory history;

    public WashingMachine(List<LaundryProgram> programs) {
        setPrograms(programs);
        this.currentProgram = this.programs.getFirst();
        this.history = new LaundryHistory();
    }

    public List<LaundryProgram> getPrograms() {
        return programs;
    }

    public void printPrograms() {
        for (LaundryProgram program : programs) {
            System.out.println(program);
        }
    }

    public void setPrograms(List<LaundryProgram> programs) {
        this.programs = programs;
    }

    public LaundryProgram getProgram() {
        return currentProgram;
    }

    public void setProgram(LaundryProgram program) throws InvalidProgramException, TemperatureOutOfRangeException, TemperatureUnitNotValidException, SpeedOutOfRangeException, InvalidDelayValueException {
        if (programs.contains(program)){
            this.currentProgram = program;
            // reset Laundry settings
            this.currentLaundry = null;
        } else {
            throw new InvalidProgramException();
        }

    }

    public Object showStatus() { // getCurrentLaundry
        if (currentLaundry == null){
            System.out.println("No laundry set.");
            return null;
        } else {
            System.out.println("Program: " + currentProgram + " Laundry settings: " + currentLaundry);
            return currentLaundry;
        }
    }

    public void setNewLaundry() {
        this.currentLaundry = new Laundry(currentProgram, 0.5, 1.0);
        System.out.println("New laundry set. Show status to view details.");
    }

    public Laundry getCurrentLaundry(){
        return currentLaundry;
    }

    public void setCurrentLaundry(Laundry currentLaundry) {
        this.currentLaundry = currentLaundry;
    }

    @Override
    public String toString() {
        JSONObject data = new JSONObject();
        data.put("number of programs", programs.size());
        data.put("current program", getProgram());
        data.put("current laundry", showStatus());
        return data.toString();
    }

    public void nextProgram() throws InvalidProgramException, InvalidDelayValueException, SpeedOutOfRangeException, TemperatureUnitNotValidException, TemperatureOutOfRangeException {
        LaundryProgram nextProgram;

        if (currentProgram.getProgramNumber() == programs.size()) {
            nextProgram = programs.getFirst();
        } else {
            nextProgram = programs.get(getIndexOfCurrentProgram(currentProgram) + 1);
        }

        setProgram(nextProgram);
    }

    public void previousProgram() throws InvalidProgramException, InvalidDelayValueException, SpeedOutOfRangeException, TemperatureUnitNotValidException, TemperatureOutOfRangeException {
        LaundryProgram previousProgram;

        if (currentProgram.getProgramNumber() == 1) {
            previousProgram = programs.getLast();
        } else {
            previousProgram = programs.get(getIndexOfCurrentProgram(currentProgram) - 1);
        }

        setProgram(previousProgram);
    }

    private int getIndexOfCurrentProgram(LaundryProgram currentProgram) {
        return programs.indexOf(currentProgram);
    }

    public LaundryHistory getHistory() {
        return history;
    }

    public void showHistory() {
        history.showHistory();
    }

    public void doLaundry() {
        history.addLaundryToHistory(new LaundryRecord(currentLaundry, currentProgram, null));
        currentLaundry = null;
        System.out.println("Laundry done!");
    }

    public void tempUp() throws TemperatureUnitNotValidException, TemperatureOutOfRangeException {
        currentLaundry.tempUp();
    }

    public void tempDown() throws TemperatureUnitNotValidException, TemperatureOutOfRangeException {
        currentLaundry.tempDown();
    }

    public void convertTemp() throws TemperatureUnitNotValidException, TemperatureOutOfRangeException {
        currentLaundry.convertTemp();
    }

    public void speedUp() throws SpeedOutOfRangeException {
        currentLaundry.speedUp(currentProgram);
    }

    public void speedDown() throws SpeedOutOfRangeException {
        currentLaundry.speedDown(currentProgram);
    }

    public void setLaundryDelay(int laundryDelay) throws InvalidDelayValueException {
        currentLaundry.setLaundryDelay(laundryDelay);
    }
}