package com.crm.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class TestUtil {
    public static long PAGE_LOAD_TIMEOUT = 80;
    public static long IMPLICIT_WAIT = 80;

    public byte[] takeScreenshotFailure(WebDriver driver){
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File SFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File DFile=new File("C:\\Users\\HP USER\\IdeaProjects\\FreeCrmTestAutomation\\ScreenShot\\"+ "photo.png");
        try {
            FileHandler.copy(SFile,DFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

    }
}