package com.fire.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firedemo {

    public static void main(String[] args) {

        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://opensource-demo.orangehrmlive.com/");

        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://demo.opencart.com/");

        WebDriver driver3 = new FirefoxDriver();
        driver3.get("http://www.bing.com");

        WebDriver driver4 = new FirefoxDriver();
        driver4.get("https://www.freecrm.com/");

        WebDriver driver5 = new FirefoxDriver();
        driver5.get("http://www.half.ebay.com");
    }
}

