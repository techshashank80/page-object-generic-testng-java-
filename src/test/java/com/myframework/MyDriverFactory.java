package com.myframework;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyDriverFactory {

	// get the Driver object
    public static WebDriver getDriver(String browser)
    {
        return createInstance(browser);
    }


    public static WebDriver createInstance(String browserName) {
        WebDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
      
        switch (browserName) {
		case "firefox":
			
			if (driver == null) {
				System.setProperty("webdriver.gecko.driver","src\\test\\resources\\drivers\\geckodriver.exe");
				 driver = new FirefoxDriver();
				 FirefoxProfile fProfile = new FirefoxProfile();
		         fProfile.setPreference("browser.download.folderList",2);
		         fProfile.setPreference("browser.download.dir", System.getProperty("user.dir")+"\\src\\test\\resources\\DownloadData");
		         fProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream; charset=iso-8859-1");
		         fProfile.setPreference("browser.download.manager.showWhenStarting",false);
		         fProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
		         capabilities.setCapability(FirefoxDriver.PROFILE, fProfile);
				
			}
			break;
        
		case "IE":
		
			if (driver == null) {
				driver = new InternetExplorerDriver();
				//drivers.put("IE", driver);
			}
			break;
		case "Chrome":
			
			if (driver == null) {
				
				driver = new ChromeDriver();
				//drivers.put("Chrome", driver);
			}
			break;
		}
		return driver;
    }
    


}
