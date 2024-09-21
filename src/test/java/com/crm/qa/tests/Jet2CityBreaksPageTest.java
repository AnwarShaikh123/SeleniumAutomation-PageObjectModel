package com.crm.qa.tests;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Jet2CityBreaksPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    Jet2CityBreaksPage jet2CityBreaksPage;
    jet2VillasPage jet2VillasPage;
    Indulgent_EscapesPage indulgentEscapesPage;


    public Jet2CityBreaksPageTest() {
        super();
    }
    @BeforeMethod
    public void setup() throws InterruptedException {
        initialization();
        jet2CityBreaksPage=new Jet2CityBreaksPage();
        jet2VillasPage=new jet2VillasPage();
        indulgentEscapesPage=new Indulgent_EscapesPage();
        loginPage = new LoginPage();
        homePage= loginPage.loginDetails(prop.getProperty("email"),prop.getProperty("password"));
        homePage.searchHoliday();
        homePage.selectDate("Nov", "2024", "04");
        Thread.sleep(5000);
        homePage.selectNights();
        Thread.sleep(4000);

        homePage.clickSearchHolidayBtn();
    }

    @Test

    public void clickPlaceTest() throws InterruptedException {

        Jet2CityBreaksPage.ClickPlace();

    }
}
