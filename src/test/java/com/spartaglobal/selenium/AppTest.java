package com.spartaglobal.selenium;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.selenium.bbcwebsite.BBCWebsite;
import com.spartaglobal.selenium.bbcwebsite.selenium_config.SeleniumConfig;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppTest {

    private static BBCWebsite website;

    @BeforeClass
    public static void setUp(){
        SeleniumConfig selCon = new SeleniumConfig("chrome");
        WebDriver driver = selCon.getDriver();
        website = new BBCWebsite(driver);

    }

    @Test
    public void testValidUsernameInput(){
        website.homePage().goToHomePage().clickSignInLink();
        website.LoginPage().inputUsername("dsajkfdkjajaf@gmail.com").inputPassword("bahdgjasfkfksjh").signIn();

        Assert.assertEquals("Please include something that isn't a letter.",
                website.LoginPage().findElement(By.xpath("//*[@id=\"form-message-password\"]/p/span/span[3]")).getText());
    }

    @AfterClass
    public static void tearDown(){
        website.quitDriver();
    }

}
