package com.javaexam.washingmachine.repository;

import java.util.List;

public class LaundryProgramsRepository {

    LaudryProgramGenerator laundryProgramGenerator = new LaudryProgramGenerator();
    List<LaundryProgram> availableLaundryPrograms = laundryProgramGenerator.createLaundryPrograms(10);

    public void printAvailableLaundryPrograms(){
        availableLaundryPrograms.stream().forEach(program -> System.out.println(program));
    }
}
