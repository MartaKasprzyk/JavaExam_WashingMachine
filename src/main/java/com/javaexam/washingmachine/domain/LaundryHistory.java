package com.javaexam.washingmachine.domain;

import java.util.ArrayList;
import java.util.List;

public class LaundryHistory {

    List<LaundryRecord> laundryHistory = new ArrayList<>();

    public void addLaundryToHistory(LaundryRecord record){
        if (laundryHistory.size() == 30){
            laundryHistory.removeFirst();
            laundryHistory.add(record);
        } else {
            laundryHistory.add(record);
        }
    }

    public void showHistory(){
        if (laundryHistory.isEmpty()) {
            System.out.println("History is empty. No laundry was done on this machine so far.");
        } else {
            laundryHistory.stream().forEach(laundry -> System.out.println(laundry));
        }
    }
}
