package com.spartaglobal.selenium.bbcwebsite.selenium_config;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {

    private WebDriver driver;
    private SeleniumPropertiesReader seleniumProperties = new SeleniumPropertiesReader();

    public SeleniumConfig(String browserName){
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", seleniumProperties.getChromeDriverPath());
            this.driver = new ChromeDriver();
        }

        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        this.driver.manage().window().setSize(new Dimension(50, 80));
    }

    public WebDriver getDriver() {
        return driver;
    }
}
