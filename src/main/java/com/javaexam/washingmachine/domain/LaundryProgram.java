package com.javaexam.washingmachine.domain;
import org.json.JSONObject;

public class LaundryProgram {
    private int programNumber;
    private String programName;
    private int maxSpeed;
    private int durationInMinutes;

    public LaundryProgram(int programNumber, String programName, int maxSpeed, int durationInMinutes) {
        this.programNumber = programNumber;
        this.programName = programName;
        this.maxSpeed = maxSpeed;
        this.durationInMinutes = durationInMinutes;
    }

    public int getProgramNumber() {
        return programNumber;
    }

    public void setProgramNumber(int programNumber) {
        this.programNumber = programNumber;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
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
