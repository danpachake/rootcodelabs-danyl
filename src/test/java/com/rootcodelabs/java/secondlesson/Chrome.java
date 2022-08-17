package com.rootcodelabs.java.secondlesson;

public class Chrome implements WebDriver {


    @Override
    public void get(String URL) {
        System.out.println("URL = " + URL);
    }

    @Override
    public String getCurrentURL() {
        return "https://www.saucedemo.com/";
    }

    @Override
    public String getPageTitle() {
        return "Swag Labs";
    }

    @Override
    public void close() {
        System.out.println("Browser to close");

    }
}
