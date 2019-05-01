package com.spartaglobal.selenium.bbcwebsite.selenium_config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumPropertiesReader {

    private String chromeDriverPath;
    private String propertiesFileLocation = "resources/selenium.properties";


    public SeleniumPropertiesReader() {
        try {
        Properties seleniumProperties = new Properties();
        seleniumProperties.load(new FileReader(propertiesFileLocation));
        this.chromeDriverPath = seleniumProperties.getProperty("chromeDriverPath");
        System.out.println("hello: "+this.chromeDriverPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public void setChromeDriverPath(String chromeDriverPath) {
        this.chromeDriverPath = chromeDriverPath;
    }
}
