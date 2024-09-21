package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Jet2CityBreaksPage extends TestBase {


    @FindBy(xpath = "(//label[@for='modal-total'])[1]")
    static WebElement TotalPerson;

    @FindBy(xpath = "//span[normalize-space()='Bed and Breakfast (46)']")
    static WebElement BoardType;

    @FindBy(xpath = "//h1[normalize-space()='BEST WESTERN PLUS Amedia Wien']")
    static WebElement SearchedPlace;

    @FindBy(xpath = "//a[normalize-space()='Compare airport, dates & prices']")
    static WebElement CompareAirport;

    @FindBy(xpath = "//a[normalize-space()='Confirm']")
    static WebElement ConfirmAirport;



    public Jet2CityBreaksPage() {
        PageFactory.initElements(driver, this);
    }


    public static void ClickPlace() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Thread.sleep(2000);


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TotalPerson);
        TotalPerson.click();
        BoardType.click();
        SearchedPlace.click();
        CompareAirport.click();
        ConfirmAirport.click();

    }
}