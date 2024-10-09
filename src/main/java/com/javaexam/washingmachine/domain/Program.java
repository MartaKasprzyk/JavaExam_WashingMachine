package com.javaexam.washingmachine.domain;

public interface Program {
    public int nextProgram();
    public int previousProgram();
    public void tempUp();
    public void tempDown();
    public double convertTemp(double temp, String degree);
    public void speedUp();
    public void speedDown();
}
