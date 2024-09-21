package com.crm.qa.tests;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    Jet2CityBreaksPage jet2CityBreaksPage;
    jet2VillasPage jet2VillasPage;
    Indulgent_EscapesPage indulgentEscapesPage;
    public HomePageTest() {
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
    }

    @Test
    public void verifyJet2CityBreaksTest(){
        jet2CityBreaksPage  = homePage.clickOnJet2CityBreaks();

    }

    @Test
    public void verifyJet2VillasTest(){
        jet2VillasPage = homePage.clickOnJet2Villas();

    }

    @Test
    public void verifyIndulgent_EscapesTest(){
        indulgentEscapesPage = homePage.clickOnIndulgent_Escapes();

    }
    @Test
    public void searchHolidayTest() {
        homePage.searchHoliday();
    }
    @Test
    public void selectDateTest() throws InterruptedException {
        homePage.searchHoliday();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.selectDate("Nov", "2024", "04");

    }

        @Test
        public void clickSearchHolidayButtonTest() throws InterruptedException {

            homePage.searchHoliday();


            Thread.sleep(3000);


            homePage.selectDate("Nov", "2024", "04");


            Thread.sleep(5000);
            homePage.selectNights();
            Thread.sleep(4000);

            homePage.clickSearchHolidayBtn();


        }

    }




