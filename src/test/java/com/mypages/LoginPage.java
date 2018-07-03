package com.mypages;

import com.myutils.MyLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver)
    {
        super(driver);

    }
    String baseURL = "http://automationpractice.com";
    @FindBy(how = How.ID, using = "email")
    public WebElement username;
    
    @FindBy(how=How.XPATH,using="/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    public WebElement signInLink;

    @FindBy(how = How.NAME, using = "passwd")
    public WebElement password;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[1]/div/div")
    public WebElement errorMessageUsername;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[2]/div/div")
   
    public WebElement errorMessagePassword;
    @FindBy(how=How.XPATH, using ="/html/body/div/div[2]/div/div[1]/a")
    public WebElement homeLink;
//    public void goToLoginPage()
//    {
//        //MyLogger.info("TargetURL:"+Envoirnment.url());
//        driver.get(baseURL);
//    }

    public void loginToHome (String pusername, String ppassword){
        //Enter Username(Email)
    	signInLink.click();
        enterText(username,pusername);
        //Enter Password
        enterText(password, ppassword);
        //Click Login Button
        click(loginButton);
        //click(homeLink);
    }



}
