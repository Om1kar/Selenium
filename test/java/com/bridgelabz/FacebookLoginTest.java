package com.bridgelabz;

import com.bridgelabz.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLoginTest extends BaseClass {
    @Test
    public void facebookLoginSuccess() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.findElement(By.id("email")).sendKeys("7020024533");
        driver.findElement(By.id("pass")).sendKeys("12facebook12");

        WebElement login = driver.findElement(By.name("login"));
        javascriptExecutor.executeScript("arguments[0].click()",login);
        Thread.sleep(3000);

        String homeTitle = driver.getTitle();
        Assert.assertEquals("(12) Facebook",homeTitle);
        Thread.sleep(3000);

        javascriptExecutor.executeScript("alert('Logged in Successful');");
        driver.switchTo().alert().accept();

    }
}
