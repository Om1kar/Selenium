package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.bridgelabz.baseclass.BaseClass.driver;

public class AutoItFileUpload {
    @Test
    public void fileUpload() throws InterruptedException , IOException {
        driver.get("https://www.freepdfconvert.com/pdf-to-word");
        Thread.sleep(2000);

        WebElement chooseBTn =driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]"));
        chooseBTn.click();

        Runtime.getRuntime().exec("C:\\Users\\hp\\Downloads\\prac1.au3");
        Thread.sleep(1000);
        System.out.println("File SuccessFully Uploaded !!");
    }
}
