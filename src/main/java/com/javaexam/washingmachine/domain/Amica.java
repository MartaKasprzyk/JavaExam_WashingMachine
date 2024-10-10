package com.javaexam.washingmachine.domain;

import com.javaexam.washingmachine.exception.InvalidWeightException;

import java.util.List;

public class Amica extends WashingMachine implements ExtraPrograms {
    private final double maxWeight;
    private double currentWeight;

    public Amica(List<LaundryProgram> programs, double maxCapacity) {
        super(programs);
        this.maxWeight = maxCapacity;
        this.currentWeight = 0.0;
    }

    public double getMaxWeight() {
        System.out.println("Max weight: " + maxWeight + "kg");
        return maxWeight;
    }

    public double getCurrentWeight() {
        System.out.println("Current laundry weight: " + maxWeight + "kg");
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) throws InvalidWeightException {
        if (currentWeight >= 0) {
            this.currentWeight = currentWeight;
        } else {
            throw new InvalidWeightException();
        }

    }

    @Override
    public int checkCurrentCapacity() {
        int currentCapacity = 0;

        if (this.currentWeight > this.maxWeight){
            System.out.println("Current weight exceeds max capacity.");
        } else if (this.currentWeight == this.maxWeight) {
            System.out.println("100% capacity reached.");
        } else {
            currentCapacity = (int) (this.currentWeight * 100 / this.maxWeight);
            System.out.println("Current capacity: " + currentCapacity + " %");
        }

        return currentCapacity;
    }

    @Override
    public int calculateLaundryDuration() {
        LaundryProgram currentProgram = getProgram();
        int defaultDuration = currentProgram.getDurationInMinutes();

        if (this.currentWeight <= 0){
            System.out.println("Can't calculate laundry duration. Landry weight must be greater than zero.");
        } else if (this.currentWeight > this.maxWeight) {
            System.out.println("Can't calculate laundry duration. Current weight exceeds max capacity.");
        } else {
            int expectedDuration = (int) (defaultDuration * (this.currentWeight/this.maxWeight));
            System.out.println("Expected laundry duration is: " + expectedDuration + "minutes.");
            return expectedDuration;
        }
        return defaultDuration;
    }

    @Override
    public Object showStatus() {
        Laundry currentLaundry = getCurrentLaundry();
        LaundryProgram currentProgram = getProgram();

        if (currentLaundry == null){
            System.out.println("No laundry set.");
            return null;
        } else {
            System.out.println("Program: " + currentProgram
                    + " Laundry settings: " + currentLaundry
                    + " Expected laundry duration: " + calculateLaundryDuration() + " min "
                    + " Laundry weight: " + this.currentWeight + " kg "
                    + " Capacity: " + checkCurrentCapacity() + " % ");
            return currentLaundry;
        }
    }

}
// TODO do not allow to doLaundry if current weight > max weight

