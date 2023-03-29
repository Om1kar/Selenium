package com.bridgelabz;

import com.bridgelabz.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameHandling extends BaseClass {
    @Test
    public void toHandleFrame() {
        driver.get("https://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
       // driver.switchTo().frame(driver.findElement(By.xpath("")));

        }
    }

