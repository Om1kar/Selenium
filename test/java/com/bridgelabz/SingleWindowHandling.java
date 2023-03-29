package com.bridgelabz;

import com.bridgelabz.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.util.Set;


public class SingleWindowHandling extends BaseClass {
    @Test
    public void toGetWindowHandle() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Address = " + parentWindow);

        driver.getWindowHandles();

        Set<String> allWindows = driver.getWindowHandles();//to store all windows in set via iterator
        for (String childWindow : allWindows) {
            if (!parentWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);//to provide focus to child window
                driver.manage().window().fullscreen();

                driver.findElement(By.id("sampleHeading")).getText();
                String text = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("Text of Child Window = " + text);
            }
        }
        Thread.sleep(3000);
        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);
        driver.quit();
    }
}
