package com.crm.qa.tests;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Indulgent_EscapesPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    Jet2CityBreaksPage jet2CityBreaksPage;
    jet2VillasPage jet2VillasPage;
    Indulgent_EscapesPage indulgentEscapesPage;

    public Indulgent_EscapesPageTest() {
        super();
    }
    @BeforeMethod
    public void setup() throws InterruptedException {
        initialization();
        jet2CityBreaksPage = new Jet2CityBreaksPage();
        jet2VillasPage = new jet2VillasPage();
        indulgentEscapesPage = new Indulgent_EscapesPage();
        loginPage = new LoginPage();
        homePage = loginPage.loginDetails(prop.getProperty("email"), prop.getProperty("password"));
    }

        @Test

        public void indulgentEscapesPageTest() throws InterruptedException {

            Indulgent_EscapesPage.Searchplace();
    }
}
