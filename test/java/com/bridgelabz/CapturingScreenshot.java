package com.bridgelabz;

import com.bridgelabz.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class CapturingScreenshot extends BaseClass {
    @Test
    public void toClickScreenShot() throws IOException, InterruptedException {
        driver.get("https://www.youtube.com/");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        screenshot.getScreenshotAs(OutputType.FILE);
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("./ScreenShot/" + "YT" + ".png");
        FileHandler.copy(file, destination);
        Thread.sleep(3000);
       // driver.close();

    }

    @Test
    public void keyBoardOperations() throws AWTException {
        driver.get("https://www.youtube.com/");
        Robot robot = new Robot();
        robot.delay(5000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_N);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_N);

        robot.mouseMove(300, 500);
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);

        robot.delay(2000);
        driver.quit();
    }
}
