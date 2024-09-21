package com.crm.qa.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.qa.util.TestUtil;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
   public static WebDriver driver;
    public static Properties prop;
    public static Logger logger;
public ExtentReports extentReports=new ExtentReports();
public ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("report.html");
    public TestBase(){
        PropertyConfigurator.configure("C:/Users/HP USER/IdeaProjects/FreeCrmTestAutomation/src/main/java/com/crm/qa/config/log4j.properties");
        try {
            extentSparkReporter.config().setReportName("Automation Test Reports");
            extentSparkReporter.config().setDocumentTitle("Jet2holiday Reports");
            extentSparkReporter.config().setTheme(Theme.DARK);
            extentReports.setSystemInfo("operating System", "Windows 10");
            extentReports.setSystemInfo("Tester", "Anwar");
            extentReports.setSystemInfo("Browser","chrome");
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:/Users/HP USER/IdeaProjects/FreeCrmTestAutomation/src/main/java/com/crm/qa/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }}
    public static void initialization() throws InterruptedException {
        String BrowserName= prop.getProperty("browser");
        if (BrowserName.equals("chrome")){
            driver=new ChromeDriver();
        } else if (BrowserName.equals("edge")){
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }
}
