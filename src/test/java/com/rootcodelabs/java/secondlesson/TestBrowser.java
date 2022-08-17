package com.rootcodelabs.java.secondlesson;

public class TestBrowser {

    public static void main(String[] args) {
        WebDriver driver = new Chrome();
        driver.get("https://www.saucedemo.com/");

    }
}
