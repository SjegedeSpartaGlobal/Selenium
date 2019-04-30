package com.spartaglobal.selenium;

import com.spartaglobal.selenium.bbcwebsite.BBCWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main( String[] args ) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SJegede\\Documents\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        BBCWebsite website = new BBCWebsite(chromeDriver);
        website.homePage().goToHomePage().clickSignInLink();
        website.LoginPage().inputUsername("dsajkfdkjajaf@gmail.com").inputPassword("bahdgjasfkfksjh");
        website.quitDriver();
    }
}
