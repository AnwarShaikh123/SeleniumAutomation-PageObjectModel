package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends TestBase {

    @FindBy(xpath = "//div[@class='hub']//li[2]")
    WebElement jet2CityBreaks;

    @FindBy(xpath = "//div[@class='hub']//li[3]//a[1]")
    WebElement jet2Villas;

    @FindBy(xpath = "//a[@href='/indulgent-escapes#indulgentEscapes']")
    WebElement indulgent_Escapes;


    @FindBy(xpath = "//div[@class='search-box-group search-box-group--from']//button[@type='button']//*[name()='svg']")
    WebElement departureDropdown;

    @FindBy(xpath = "//span[normalize-space()='Birmingham']")
    WebElement birminghamOption;

    @FindBy(xpath = "//span[normalize-space()='Done']")
    WebElement doneButton;

    @FindBy(xpath = "//label[normalize-space()='Austria']")
    WebElement austriaOption;

    @FindBy(xpath = "//a[@class='bttn bttn--primary bttn--3d button--base']")
    WebElement searchButton;

    @FindBy(xpath = "//select[@id='duration-month']")
    WebElement monthDropdown;

    @FindBy(xpath = "//select[@id='duration-year']")
    WebElement yearDropdown;

    @FindBy(xpath = "//div[contains(text(),'04')]")
    List<WebElement> dateElements;

    @FindBy(xpath="(//button[@type='button'])[4]")
    WebElement nightsOptions;

    @FindBy(css = "option[value='4']")
    WebElement d4;

    @FindBy(xpath = "//button[@class='search-box__submit button bttn bttn--primary']")
    WebElement searchHolidayButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void searchHoliday() {

        departureDropdown.click();

        birminghamOption.click();

        doneButton.click();

        austriaOption.click();

        searchButton.click();
    }

    public void selectDate(String month, String year, String date) {

        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText(month);


        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText(year);


        for (WebElement dt : dateElements) {
            String dataText = dt.getText();
            if (dataText.equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public void selectNights() {
//
        nightsOptions.click();
        d4.click();

    }


    public void clickSearchHolidayBtn() {
        searchHolidayButton.click();
    }

    public Jet2CityBreaksPage clickOnJet2CityBreaks() {
        jet2CityBreaks.click();
        return new Jet2CityBreaksPage();
    }

    public jet2VillasPage clickOnJet2Villas() {
        jet2Villas.click();
        return new jet2VillasPage();
    }

    public Indulgent_EscapesPage clickOnIndulgent_Escapes() {
        indulgent_Escapes.click();
        return new Indulgent_EscapesPage();
    }


}
