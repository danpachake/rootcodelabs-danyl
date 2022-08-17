package com.rootcodelabs.java.firstlesson;

public class LessonTwo {

    public static void main(String[] args) {

        //TODO: Variables shall be renamed address1--> addressLine1 etc
        String address1 = "56/1, "; //TODO: Comma and spacing should be done in method
        String address2 = "Kynsey Road, ";
        String address3 = "Colombo - 07";

        //String fullAddress = String.format("My address is %s %s %s", address1, address2, address3);

        System.out.println(getFullAddress(address1, address2, address3));

    }

    //TODO: Format the code before the commits. You can use shortcut ALT+CTRL+L for format the code
    private static String getFullAddress(String add1, String add2, String add3) {
        //TODO: Variable name fullName is not suitable. Use String.format to format the string
        String fullName = "My full address is " + add1 + add2 + add3;
        return fullName;

    }

}