package com.spartaglobal.selenium.bbcwebsite.bbcpagesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private String loginPageURL = "https://account.bbc.com/signin";
    private By userField = By.id("user-identifier-input");
    private By password = By.id("password-input");
    private By signIn = By.id("submit-button");


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

    public LoginPage signIn(){
        driver.findElement(this.signIn).click();
        return this;
    }

    public WebElement findElement(By element){

        return driver.findElement(element);
    }

}
