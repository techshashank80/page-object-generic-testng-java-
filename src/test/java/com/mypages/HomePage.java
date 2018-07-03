package com.mypages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    public WebElement userNameHome;
    @FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div/div[1]/p")
    public WebElement errorMessage;

    public String getUserName (){
        ///JavascriptExecutor jse = (JavascriptExecutor)driver;
       // jse.executeScript("window.scrollBy(0,-350)", "");
       return readText(userNameHome);
    }
    
    public String getError()
    {
    	return readText(errorMessage);
    }
}
