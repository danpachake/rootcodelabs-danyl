package com.rootcodelabs.util;

import com.github.javafaker.Faker;

public class DataManager {


    public static String getFirstname() {
       Faker faker = new Faker();
       String firstname = faker.name().firstName().replaceAll("'", "").trim();
             return firstname;
    }

    public static String getLastname() {
        Faker faker = new Faker();
        String lastname = faker.name().firstName().replaceAll("'", "").trim();
        return lastname;
    }

    public static String getMiddleName() {
        return getLastname();
    }

    public static EmployeeDetails getEmployeeDetails() {
        return new EmployeeDetails();
    }
}
