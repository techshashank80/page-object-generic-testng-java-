package com.myframework;

import org.openqa.selenium.WebDriver;

public class MyDriverManager {
	protected static ThreadLocal<WebDriver> seleniumDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return seleniumDriver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        seleniumDriver.set(driver);
    }

    public static void closeDriver(){
        if (seleniumDriver.get() != null) {
        	getDriver().quit();
        	seleniumDriver.remove();
            //setWebDriver(null);
        }
    }
}
