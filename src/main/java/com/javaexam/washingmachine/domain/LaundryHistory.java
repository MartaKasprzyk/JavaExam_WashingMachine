package com.javaexam.washingmachine.domain;

import java.util.ArrayList;
import java.util.List;

public class LaundryHistory {

    List<Laundry> laundryHistory = new ArrayList<>();

    public void addLaundryToHistory(Laundry laundry){
        laundryHistory.add(laundry);
    }

    public void showHistory(){
        if (laundryHistory.isEmpty()) {
            System.out.println("No laundry done on this machine");
        } else {
            laundryHistory.stream().forEach(laundry -> System.out.println(laundry));
        }
    }
}
