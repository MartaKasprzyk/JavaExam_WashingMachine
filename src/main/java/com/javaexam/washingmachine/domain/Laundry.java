package com.javaexam.washingmachine.domain;
import org.json.JSONObject;

public class Laundry {
    LaundryProgram program;
    double temp;
    char tempUnit;
    int speed;

    public Laundry(LaundryProgram program, double temp, char tempUnit, int speed) {
        this.program = program;
        this.temp = temp;
        this.tempUnit = tempUnit;
        this.speed = speed;
    }


    public LaundryProgram getProgram() {
        return program;
    }

    public void setProgram(LaundryProgram program) {
        this.program = program;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public char getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(char tempUnit) {
        this.tempUnit = tempUnit;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        JSONObject data = new JSONObject();
        data.put("laundryProgram", getProgram());
        data.put("temp", getTemp());
        data.put("tempUnit", getTempUnit());
        data.put("speed", getSpeed());
        return data.toString();
    }
}
