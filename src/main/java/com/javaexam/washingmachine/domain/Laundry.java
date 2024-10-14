package com.javaexam.washingmachine.domain;
import com.javaexam.washingmachine.exception.InvalidDelayValueException;
import com.javaexam.washingmachine.exception.SpeedOutOfRangeException;
import com.javaexam.washingmachine.exception.TemperatureOutOfRangeException;
import com.javaexam.washingmachine.exception.TemperatureUnitNotValidException;
import org.json.JSONObject;

public class Laundry{
    private double temp;
    private String tempUnit;
    private int speed;
    private double stepCel, stepFar;
    private final int stepSpeed = 100;
    private int laundryDelay;

    public Laundry(LaundryProgram currentProgram, double stepCel, double stepFar) {
        this.temp = 30;
        this.tempUnit = TemperatureUnit.CELSIUS.getUnit();
        this.stepCel = stepCel;
        this.stepFar = stepFar;
        this.speed = currentProgram.getMaxSpeed();
        this.laundryDelay = 0;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) throws TemperatureOutOfRangeException {
        verifyIfTempInRange(temp, this.tempUnit);

        if (verifyIfTempInRange(temp, this.tempUnit)) {
            this.temp = temp;
        } else {
            throw new TemperatureOutOfRangeException();
        }

        System.out.println("Current temperature: " + temp + this.tempUnit);
    }

    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String tempUnit) throws TemperatureUnitNotValidException {
        String celsius = TemperatureUnit.CELSIUS.getUnit();
        String fahrenheit = TemperatureUnit.FAHRENHEIT.getUnit();

        if (tempUnit.equals(celsius) || tempUnit.equals(fahrenheit)) {
            this.tempUnit = tempUnit;
        } else {
            throw new TemperatureUnitNotValidException();
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(LaundryProgram program, int speed) throws SpeedOutOfRangeException {

        if (speed > program.getMaxSpeed()) {
            throw new SpeedOutOfRangeException("Speed you are trying to set is higher than max speed for this program.");
        } else if (speed <= 0) {
            throw new SpeedOutOfRangeException("Speed can not be lower than zero.");
        } else {
            this.speed = speed;
        }
    }

    public int getLaundryDelay() {
        return laundryDelay;
    }

    public void setLaundryDelay(int laundryDelay) throws InvalidDelayValueException {
        if (laundryDelay >= 0) {
            this.laundryDelay = laundryDelay;
            System.out.println("Laundry delayed by " + laundryDelay + " minutes.");
        } else {
            throw new InvalidDelayValueException();
        }
    }

    @Override
    public String toString() {
        JSONObject data = new JSONObject();
        data.put("temp", getTemp());
        data.put("tempUnit", getTempUnit());
        data.put("speed", getSpeed());
        data.put("laundry delay", getLaundryDelay());
        return data.toString();
    }

    public void tempUp() throws TemperatureOutOfRangeException, TemperatureUnitNotValidException {
        double newTemp;

        if (this.tempUnit.equals(TemperatureUnit.CELSIUS.getUnit())) {
            newTemp = this.temp + stepCel;
        } else if (this.tempUnit.equals(TemperatureUnit.FAHRENHEIT.getUnit())) {
            newTemp = this.temp + stepFar;
        } else {
            throw new TemperatureUnitNotValidException();
        }

        setTemp(newTemp);
    }

    public void tempDown() throws TemperatureOutOfRangeException, TemperatureUnitNotValidException{
        double newTemp;

        if (this.tempUnit.equals(TemperatureUnit.CELSIUS.getUnit())) {
            newTemp = this.temp - stepCel;
        } else if (this.tempUnit.equals(TemperatureUnit.FAHRENHEIT.getUnit())) {
            newTemp = this.temp - stepFar;
        } else {
            throw new TemperatureUnitNotValidException();
        }

        setTemp(newTemp);
    }

    private boolean verifyIfTempInRange(double newTemp, String tempUnit) {
        if (tempUnit.equals(TemperatureUnit.CELSIUS.getUnit())) {
            return newTemp >= 30 && newTemp <= 90;
        } else if (tempUnit.equals(TemperatureUnit.FAHRENHEIT.getUnit())) {
            return newTemp >= 86 && newTemp <= 194;
        }
        return false;
    }

    public void convertTemp() throws TemperatureUnitNotValidException, TemperatureOutOfRangeException {
        String celsius = TemperatureUnit.CELSIUS.getUnit();
        String fahrenheit = TemperatureUnit.FAHRENHEIT.getUnit();
        double convertedTemp;

        if (this.tempUnit.equals(celsius)) {
            convertedTemp = this.temp * 1.8 + 32;
            setTempUnit(fahrenheit);
        } else if (this.tempUnit.equals(fahrenheit)) {
            convertedTemp = (this.temp - 32) / 1.8;
            setTempUnit(celsius);
        } else {
            throw new TemperatureUnitNotValidException();
        }

        setTemp(convertedTemp);
    }

    public void speedUp(LaundryProgram program) throws SpeedOutOfRangeException{
        int newSpeed = this.speed + stepSpeed;
        setSpeed(program, newSpeed);
    }

    public void speedDown(LaundryProgram program) throws SpeedOutOfRangeException {
        int newSpeed = this.speed - stepSpeed;
        setSpeed(program, newSpeed);
    }
}