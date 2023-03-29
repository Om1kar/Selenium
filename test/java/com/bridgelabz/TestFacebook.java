package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        //to get into particular options
        driver.findElement(By.linkText("Forgotten password?")).click();

        //to minimize after launching
        driver.manage().window().maximize();

        driver.navigate().forward();
        //to close window
        driver.quit();
    }
}
