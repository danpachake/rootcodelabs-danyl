package com.rootcodelabs.java.firstlesson;

public class LessonOne {

    public static void main(String[] args) {
        String val1 = "10.5";
        String val2 = "12.5";

        float total = Float.parseFloat(val1) + Float.parseFloat(val2);

        System.out.println("Total is USD " + total);
    }

}

