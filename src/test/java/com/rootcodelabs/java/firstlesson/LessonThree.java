package com.rootcodelabs.java.firstlesson;

import com.github.javafaker.Faker;

public class LessonThree {

    public static void main(String[] args) {

        Faker faker = new Faker();
        String mobileNumber = faker.phoneNumber().phoneNumber();
        System.out.println(String.format("Mobile no. %s", mobileNumber));
    }

}
