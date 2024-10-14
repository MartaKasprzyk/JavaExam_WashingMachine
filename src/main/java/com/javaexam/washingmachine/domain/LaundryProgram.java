package com.javaexam.washingmachine.domain;
import org.json.JSONObject;

public class LaundryProgram {
    private final int programNumber;
    private final String programName;
    private final int maxSpeed;
    private final int durationInMinutes;

    public LaundryProgram(int programNumber, String programName, int maxSpeed, int durationInMinutes) {
        this.programNumber = programNumber;
        this.programName = programName;
        this.maxSpeed = maxSpeed;
        this.durationInMinutes = durationInMinutes;
    }

    public int getProgramNumber() {
        return programNumber;
    }

    public String getProgramName() {
        return programName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }


    @Override
    public String toString() {
        JSONObject data = new JSONObject();
        data.put("programNumber", getProgramNumber());
        data.put("programName", getProgramName());
        data.put("maxSpeed", getMaxSpeed());
        data.put("durationInMinutes", getDurationInMinutes());
        return data.toString();
    }
}