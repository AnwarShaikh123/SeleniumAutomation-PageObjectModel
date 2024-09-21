package com.crm.qa.tests;

import com.crm.qa.Listener.CustomListener;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.crm.qa.base.TestBase.driver;
import static io.qameta.allure.SeverityLevel.*;
import static org.openqa.selenium.devtools.v122.memory.model.PressureLevel.CRITICAL;

@Listeners(CustomListener.class)
public class LoginPageTest extends TestBase {
     LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        initialization();  // Initialize WebDriver and open the browser
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    @Description("This test attempts to log into the website using a login and a password. Fails if any error happens.\n\nNote that this test does not test 2-Factor Authentication.")
  @Epic("EP001")
    @Feature("Feature1 : Login")
    @Story("Story : login the account with emailid and password")
    @Severity(SeverityLevel.BLOCKER)
    public void validateLoginFunctionality() {
      homePage=  loginPage.loginDetails(prop.getProperty("email"),prop.getProperty("password"));
        Assert.assertNotNull(homePage, "Login failed: HomePage is not loaded");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
    }

