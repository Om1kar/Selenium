package com.bridgelabz;

import com.bridgelabz.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class FacebookTest extends BaseClass {

    @Test
    public void redirectToValidScreen() {
        driver.get("https://www.facebook.com/");
        String fbLoginTittle = driver.getTitle();
        Assert.assertEquals("Facebook – log in or sign up", fbLoginTittle);
    }

    @Test
    public void fbCreateNewAccountTest() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        WebElement createPopup = driver.findElement(By.linkText("Create new account"));
        boolean flag = createPopup.isDisplayed();
        Assert.assertEquals(true, flag);
        createPopup.click();

        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Jon");
        driver.findElement(By.name("lastname")).sendKeys("Bro");
        driver.findElement(By.name("reg_email__")).sendKeys("7020024533");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Jon#456");

        WebElement day = driver.findElement(By.id("day"));
        Select select = new Select(day);
        select.selectByValue("1");
        Thread.sleep(300);

        WebElement month = driver.findElement(By.id("month"));
        Select select1 = new Select(month);
        select1.selectByIndex(5);
        Thread.sleep(300);

        WebElement year = driver.findElement(By.id("year"));
        Select select2 = new Select(year);
        select2.selectByVisibleText("2022");
        Thread.sleep(3000);

        boolean flag1 = select.isMultiple();
        if (flag1) {
            System.out.println("Multiple Selection are Not Allowed !!");
        }

    }

    @Test
    public void facebookWebsite_RadioButtonTest() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        WebElement createPopup = driver.findElement(By.linkText("Create new account"));
        boolean flag = createPopup.isDisplayed();
        Assert.assertEquals(true, flag);
        createPopup.click();
        Thread.sleep(3000);

        //driver.findElements(By.name("sex")).get(0).click();
        List<WebElement> radio = driver.findElements(By.name("sex"));
        for (int i = 0; i < radio.size(); i++) {
            System.out.println(radio.get(i).getText());
            radio.get(i).click();
        }
        Thread.sleep(1000);
    }
}