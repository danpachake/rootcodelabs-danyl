package com.rootcodelabs.java.firstlesson;

import com.github.javafaker.Faker;

public class LessonThree {

    public static void main(String[] args) {

        Faker faker = new Faker();
        //TODO: Are we getting the expected phone number format. Please refer to my solution
        String mobileNumber = faker.phoneNumber().phoneNumber();
        System.out.println(String.format("Mobile no. %s", mobileNumber));

        String newMobileNumber = getMobileNumber("071", 10);
        System.out.println("newMobileNumber = " + newMobileNumber);
    }


    public static String getMobileNumber(String prefix, int length) {
        Faker faker = new Faker();
        String suffix = faker.number().digits(length - prefix.length());
        return String.format("%s%s", prefix, suffix);
    }


}
