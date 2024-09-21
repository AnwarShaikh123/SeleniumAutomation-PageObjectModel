package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    public static Logger logger =Logger.getLogger(LoginPage.class);

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement acceptCookiesButton;

    @FindBy(xpath = "//a[normalize-space()='Sign in now']")
     WebElement signInNowLink;

    @FindBy(xpath = "//input[@id='email']")
     WebElement emailInput;

    @FindBy(xpath = "//button[@id='continue']")
     WebElement continueButton;

    @FindBy(xpath = "//input[@id='password']")
     WebElement passwordInput;

    @FindBy(xpath = "//button[@id='next']")
     WebElement nextButton;

    @FindBy(xpath = "//button[@id='continue']")
    WebElement continueBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
        logger.info("loggingpage elements is in intialized");
    }

    public HomePage loginDetails(String email, String password) {
        acceptCookiesButton.click();
        signInNowLink.click();
        emailInput.sendKeys(email);
        continueButton.click();
        passwordInput.sendKeys(password);
        nextButton.click();
        continueBtn.click();
        return new HomePage();
    }
}
