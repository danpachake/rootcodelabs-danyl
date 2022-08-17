package com.rootcodelabs.java.secondlesson;

public interface WebDriver {

    public void get(String URL);

    public String getCurrentURL();

    public String getPageTitle();

    public void close();

}
