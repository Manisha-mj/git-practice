package com.mycompany.jenkins_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestNew {

    @Test
    public void openGoogle() {
        // Automatically downloads and sets the correct ChromeDriver version
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); // Launch Chrome
        driver.get("https://www.google.com"); // Open Google

        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertTrue(actualTitle.contains("Google"), "Title does not contain Google!");

        driver.quit(); // Close browser
    }
}
