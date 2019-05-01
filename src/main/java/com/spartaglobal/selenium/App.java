package com.spartaglobal.selenium;

import com.spartaglobal.selenium.bbcwebsite.BBCWebsite;
import com.spartaglobal.selenium.bbcwebsite.selenium_config.SeleniumConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main( String[] args ) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SJegede\\Documents\\chromedriver.exe");
//        WebDriver chromeDriver = new ChromeDriver();
        SeleniumConfig selCon = new SeleniumConfig("chrome");
        WebDriver driver = selCon.getDriver();
        BBCWebsite website = new BBCWebsite(driver);
        website.homePage().goToHomePage().clickSignInLink();
        website.LoginPage().inputUsername("dsajkfdkjajaf@gmail.com").inputPassword("bahdgjasfkfksjh");
        website.quitDriver();
    }
}
