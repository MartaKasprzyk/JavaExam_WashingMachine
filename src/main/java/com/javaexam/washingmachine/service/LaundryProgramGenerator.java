package com.javaexam.washingmachine.service;

import com.javaexam.washingmachine.domain.LaundryProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaundryProgramGenerator {

    // data for predefined programs
    ArrayList<Integer> programNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
    ArrayList<String> programNames = new ArrayList<>(Arrays.asList("cotton", "delicates", "quick", "eco", "wool",
            "synthetics", "haevy duty", "rinse and spin", "hand wash", "fur removal",
            "sportswear", "ultra quick", "baby care", "allergy", "refresh"));
    ArrayList<Integer> centrifugeSpeeds = new ArrayList<>(Arrays.asList(800, 500, 1000, 500, 600,
            700, 1000, 900, 300, 1000,
            400, 600, 300, 800, 500));
    ArrayList<Integer> programDurations = new ArrayList<>(Arrays.asList(150, 120, 30, 60, 90,
            60, 150, 30, 120, 150,
            30, 15, 60, 90, 40));

    public List<LaundryProgram> createLaundryPrograms(int numberOfPrograms) {
        List<LaundryProgram> availableLaundryPrograms = new ArrayList<>();

        for (int i = 0; i < numberOfPrograms; i++ ){
            LaundryProgram laundryProgram = new LaundryProgram(
                    programNumbers.get(i),
                    programNames.get(i),
                    centrifugeSpeeds.get(i),
                    programDurations.get(i)
            );

            availableLaundryPrograms.add(laundryProgram);
        }
        return availableLaundryPrograms;
    }
}
