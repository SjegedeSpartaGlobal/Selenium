package com.spartaglobal.selenium.bbcwebsite;

import com.spartaglobal.selenium.bbcwebsite.pages.HomePage;
import com.spartaglobal.selenium.bbcwebsite.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class BBCWebsite {

    private WebDriver driver;


    public BBCWebsite(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage(){
        return new HomePage(this.driver);
    }

    public LoginPage LoginPage(){
        return new LoginPage(this.driver);
    }

    public void quitDriver(){
        driver.quit();
    }

}
