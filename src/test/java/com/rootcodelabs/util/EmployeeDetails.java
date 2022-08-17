package com.rootcodelabs.util;

import com.github.javafaker.Faker;

public class EmployeeDetails {

    private String firstName;
    private String lastName;
    private String middleName;
    private String username;

    private String empNum;

    public EmployeeDetails() {
        this.firstName = DataManager.getFirstname();
        this.lastName = DataManager.getLastname();
        this.middleName = DataManager.getMiddleName();
        this.username = String.format("%s.%s",firstName, lastName).toLowerCase();
        this.empNum = getEmployeeNumber();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmployeeNumber(){
        Faker faker = new Faker();
        String empNum = "EN-" + faker.number().numberBetween(1, 1000);
        return empNum;
    }



    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getUsername() {
        return username;
    }
}