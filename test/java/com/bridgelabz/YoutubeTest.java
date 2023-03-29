package com.bridgelabz;

import com.bridgelabz.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YoutubeTest extends BaseClass {

    @Test
    public void main() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/");

        System.out.println("Title = " + driver.getTitle());//prints name of the current webpage
        System.out.println("URL = " + driver.getCurrentUrl());//prints current URL
        System.out.println("Page Source = " + driver.getPageSource());//prints page source

        driver.findElement(By.id("email")).sendKeys("omkar");//add data in email field
        Thread.sleep(1000);//to add delay before executing next query
        driver.findElement(By.name("pass")).sendKeys("321");//add data in pass field
        Thread.sleep(2000);
        driver.quit();



    }
}
