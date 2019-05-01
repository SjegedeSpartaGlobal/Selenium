package com.spartaglobal.selenium.bbcwebsite.bbcpagesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private String loginPageURL = "https://account.bbc.com/signin";
    private By userField = By.id("user-identifier-input");
    private By password = By.id("password-input");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSignInPage(){
        driver.navigate().to(loginPageURL);
    }

    public LoginPage inputUsername(String userName){
        driver.findElement(userField).sendKeys(userName);
        return this;
    }

    public LoginPage inputPassword(String password){
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public void findElement(By element){
        driver.findElement(element);
    }

}