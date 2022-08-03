package com.rootcodelabs.java.firstlesson;

public class LessonTwo {

    public static void main(String[] args) {

        String address1 = "56/1, ";
        String address2 = "Kynsey Road, ";
        String address3 = "Colombo - 07";

        //String fullAddress = String.format("My address is %s %s %s", address1, address2, address3);

        System.out.println(getFullAddress(address1, address2, address3));

    }

        private static String getFullAddress(String add1, String add2, String add3) {

        String fullName = "My full address is " + add1 + add2 + add3;
        return fullName;

        }

}