package com.mypages;

import com.myutils.MyLogger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(how = How.NAME, using = "firstname")
    public WebElement firstName;
    @FindBy(how=How.NAME, using="lastname")
    public WebElement lastName;
    @FindBy(how=How.NAME,using="phone")
    public WebElement phone;
    @FindBy(how=How.NAME,using="email")
    public WebElement email;
    @FindBy(how=How.NAME,using="password")
    public WebElement password;
    @FindBy(how=How.NAME,using="confirmpassword")
    public WebElement confirmPassword;
    @FindBy(how=How.XPATH, using="//*[@id=\"headersignupform\"]/div[9]/button")
    public WebElement singUpBtn;
    @FindBy(how=How.XPATH, using="\n" + "//*[@id=\"loginfrm\"]/div[2]/div[1]/a")
    public WebElement singUpBtnLoginPage;

   //Register the new user
    public void registerUser()
    {
        enterText(firstName,"Mike");
        enterText(lastName,"Lee");
        enterText(phone,"1234567890");
        enterText(email,"mikelee@gmail.com");
        enterText(password,"password");
        enterText(confirmPassword,"password");
        click(singUpBtn);
    }
// Go to Registration page
    public void goToRegistrationPage()
    {   JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        MyLogger.info("Navigate To Registration page");
        click(singUpBtnLoginPage);
    }


}
