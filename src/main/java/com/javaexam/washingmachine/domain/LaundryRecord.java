package com.javaexam.washingmachine.domain;

import org.json.JSONObject;

public class LaundryRecord {
    private LaundryProgram program;
    private double temp;
    private String unit;
    private int speed;
    private int laundryDelay;

    public LaundryRecord(Laundry laundry, LaundryProgram program){
        this.temp = laundry.getTemp();
        this.unit = laundry.getTempUnit();
        this.speed = laundry.getSpeed();
        this.program = program;
        this.laundryDelay = laundry.getLaundryDelay();
    }

    @Override
    public String toString() {
        JSONObject data = new JSONObject();
        data.put("laundryProgram", program);
        data.put("temp", temp);
        data.put("tempUnit", unit);
        data.put("speed", speed);
        data.put("laundryDelay", laundryDelay);
        return data.toString();
    }
}
