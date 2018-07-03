package com.mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage extends BasePage{

    public AccountPage(WebDriver driver)
    {
        super(driver);
    }
    
    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a")
    public WebElement addressLink;
    @FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div/div[1]/p")
    public WebElement errorMessage;
    
    public void gotoAddressPage()
    {
    	click(addressLink);
    }
}
