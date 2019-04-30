package com.spartaglobal.selenium.bbcwebsite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private final String homePageURL = "https://www.bbc.co.uk/";
    private final By SignInLink = By.id("idcta-username");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage goToHomePage(){
        driver.navigate().to(homePageURL);
        return this;
    }

    public HomePage clickSignInLink(){
        driver.findElement(SignInLink).click();
        return this;
    }



}
