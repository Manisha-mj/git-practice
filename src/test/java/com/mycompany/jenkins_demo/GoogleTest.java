package com.mycompany.jenkins_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void openGoogle() {
        // Set up ChromeDriver (no need if you're using WebDriverManager)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver(); // Launch Chrome
        driver.get("https://www.google.com"); // Open Google

        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertTrue(actualTitle.contains("Google"), "Title does not contain Google!");

        driver.quit(); // Close browser
    }
}
