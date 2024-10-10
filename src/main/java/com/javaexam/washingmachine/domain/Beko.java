package com.javaexam.washingmachine.domain;

import java.util.List;

public class Beko extends WashingMachine implements ExtraPrograms {

    public Beko(List<LaundryProgram> programs) {
        super(programs);
    }

    @Override
    public void setNewLaundry() {
        LaundryProgram currentProgram = getProgram();
        Laundry newLaundry = new Laundry(currentProgram, 1.0, 2.0);
        setCurrentLaundry(newLaundry);
        System.out.println("New laundry set. Show status to view details.");
    }


    @Override
    public int checkCurrentCapacity() {
        System.out.println("working");
        return -1;
    }

    @Override
    public void calculateLaundryDuration() {
        System.out.println("working");
    }
}
