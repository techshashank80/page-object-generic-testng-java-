package com.mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressPage extends BasePage {
	
	public AddressPage(WebDriver driver)
    {
        super(driver);
    }
	
	@FindBy (how=How.XPATH, using=".//*[@id='center_column']/div[1]/div/div/ul/li[9]/a[1]/span" )
	private WebElement updateAddress;
	
}
