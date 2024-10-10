package com.javaexam.washingmachine.domain;

import org.json.JSONObject;

public class LaundryRecord {
    public LaundryProgram program;
    public double temp;
    public String unit;
    public int speed;
    public int laundryDelay;
    public int capacity;

    public LaundryRecord(Laundry laundry, LaundryProgram program, Integer capacity){
        this.temp = laundry.getTemp();
        this.unit = laundry.getTempUnit();
        this.speed = laundry.getSpeed();
        this.program = program;
        this.laundryDelay = laundry.getLaundryDelay();
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        JSONObject data = new JSONObject();
        data.put("laundryProgram", program);
        data.put("temp", temp);
        data.put("tempUnit", unit);
        data.put("speed", speed);
        data.put("laundryDelay", laundryDelay);
        data.put("capacity", capacity);
        return data.toString();
    }
}
