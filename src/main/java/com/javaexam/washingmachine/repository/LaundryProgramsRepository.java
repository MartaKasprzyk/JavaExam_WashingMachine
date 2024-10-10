package com.javaexam.washingmachine.repository;

import com.javaexam.washingmachine.domain.LaundryProgram;
import com.javaexam.washingmachine.service.LaundryProgramGenerator;

import java.util.List;

public class LaundryProgramsRepository {

    LaundryProgramGenerator laundryProgramGenerator = new LaundryProgramGenerator();
    List<LaundryProgram> availableLaundryPrograms = laundryProgramGenerator.createLaundryPrograms(10);

    public void printAvailableLaundryPrograms(){
        availableLaundryPrograms.stream().forEach(program -> System.out.println(program));
    }
}
