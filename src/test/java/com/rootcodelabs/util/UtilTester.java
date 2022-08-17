package com.rootcodelabs.util;

public class UtilTester {

    public static void main(String[] args) {
        String firstname = DataManager.getFirstname();
        String lastname = DataManager.getLastname();
        String middleName = DataManager.getMiddleName();

        EmployeeDetails employee = DataManager.getEmployeeDetails();

//        System.out.println(firstname);
//        System.out.println(lastname);
//        System.out.println(middleName);

        EmployeeDetails firstEmployee = DataManager.getEmployeeDetails();
        System.out.println(firstEmployee.getFirstName());
        System.out.println(firstEmployee.getLastName());
        System.out.println(firstEmployee.getMiddleName());
        System.out.println(firstEmployee.getUsername());
        System.out.println(firstEmployee.getEmployeeNumber());
        }

}
