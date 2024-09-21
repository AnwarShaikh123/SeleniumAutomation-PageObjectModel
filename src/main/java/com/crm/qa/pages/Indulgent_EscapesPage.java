package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.crm.qa.base.TestBase.driver;


public class Indulgent_EscapesPage extends TestBase {

    @FindBy(xpath = "(//span[normalize-space()='Indulgent Escapes'])[1]")
    static WebElement selectIndulgent;

    @FindBy(className = "search-box-group__link")
    static WebElement dropdown;
    @FindBy(xpath = "(//label[@for='airport_selector_80_BHX'])[1]")
    static WebElement birmingham;

    @FindBy(xpath = "(//a[normalize-space()='Done'])[1]")
    static WebElement DoneBtn;

    @FindBy(xpath = "(//label[normalize-space()='Balearics'])[1]")
    static WebElement CountrySelect;

    @FindBy(xpath = "(//a[@class='bttn bttn--primary bttn--3d button--base'])[1]")
    static WebElement DoneButton;

    @FindBy(xpath = "(//div[contains(text(),'21')])[1]")
    static WebElement date;

    @FindBy(xpath = "(//select[@id='search-box-nights'])[1]")
    static WebElement nightsOption;


    @FindBy(xpath = "(//button[@class='search-box__submit button bttn bttn--primary'])[1]")
    static WebElement searchBtn;

    @FindBy(xpath = "(//label[@for='modal-total'])[1]")
    static WebElement totalPerson;

    @FindBy(xpath = "(//label[@for='filter-boardbasis-1'])[1]")
    static WebElement BoardBed;

    @FindBy(xpath = "(//h1[normalize-space()='Villa Le Blanc a Gran Melia Hotel'])[1]")
    static WebElement hotelSel;



    public Indulgent_EscapesPage() {
        PageFactory.initElements(driver, this);
    }
    public static void Searchplace() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       // try {
            wait.until(ExpectedConditions.elementToBeClickable(selectIndulgent)).click();
            wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            wait.until(ExpectedConditions.elementToBeClickable(birmingham)).click();
            wait.until(ExpectedConditions.elementToBeClickable(DoneBtn)).click();
            wait.until(ExpectedConditions.elementToBeClickable(CountrySelect)).click();
            wait.until(ExpectedConditions.elementToBeClickable(DoneButton)).click();
            wait.until(ExpectedConditions.elementToBeClickable(date)).click();
            wait.until(ExpectedConditions.elementToBeClickable(nightsOption)).click();
            wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
            wait.until(ExpectedConditions.elementToBeClickable(totalPerson)).click();
            wait.until(ExpectedConditions.elementToBeClickable(BoardBed)).click();
            wait.until(ExpectedConditions.elementToBeClickable(hotelSel)).click();
//        } catch (StaleElementReferenceException e) {
//            System.out.println("Stale Element Exception: " + e.getMessage());
//
//        }
    }
    }

