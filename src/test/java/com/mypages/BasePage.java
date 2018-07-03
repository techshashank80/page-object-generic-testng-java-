package com.mypages;

import com.myframework.MyEnvironment;
import com.myutils.MyLogger;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Pages {

    public BasePage(WebDriver driver) {
        super(driver);
    }


    WebDriverWait wait = new WebDriverWait(this.driver,60);
  

  
    //Generic click method (Supports both By or WebElement)
    public <T> void click (T elementAttribute) {
        if(elementAttribute.getClass().getName().contains("By")) {
            wait.until(ExpectedConditions.elementToBeClickable((By)elementAttribute));
            MyLogger.info("Clicked:"+elementAttribute);
            driver.findElement((By) elementAttribute).click();
        } else {
            wait.until(ExpectedConditions.elementToBeClickable((WebElement)elementAttribute));
            MyLogger.info("Clicked:"+elementAttribute);
            ((WebElement) elementAttribute).click();
        }
    }

    //Generic enterText method (Supports both By or WebElement)
    public <T> void enterText (T elementAttribute, String text) {
        if(elementAttribute.getClass().getName().contains("By")) {
            MyLogger.info("Text Entered : "+text);
            
            driver.findElement((By) elementAttribute).sendKeys(text);
        } else {
            MyLogger.info("Text Entered : "+text);
            ((WebElement) elementAttribute).sendKeys(text);
        }
    }

    //Generic readText method (Supports both By or WebElement)
    public <T> String readText (T elementAttribute) {
        if(elementAttribute.getClass().getName().contains("By")) {
            //LOGGER.info("Read Text  : "+text);
            wait.until(ExpectedConditions.visibilityOf((WebElement)elementAttribute));
            return driver.findElement((By) elementAttribute).getText();
        } else {
            wait.until(ExpectedConditions.visibilityOf((WebElement)elementAttribute));
            return ((WebElement) elementAttribute).getText();
        }
    }

}
