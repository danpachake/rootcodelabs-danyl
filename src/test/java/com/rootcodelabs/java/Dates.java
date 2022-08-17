package com.rootcodelabs.java;

import com.rootcodelabs.util.DatesManager;

public class Dates {

    public static void main(String[] args) {

       String currentDate = DatesManager.getCurrentDate();
       System.out.println("current Date is = " + currentDate);

       String randomDate = DatesManager.getRandomDate();
       System.out.println("Random Date is = " + randomDate);
    }
}
