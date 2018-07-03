package com.mypages;

import com.myframework.MyEnvironment;
import com.myframework.MyDriverFactory;
import com.myframework.MyDriverManager;
import com.myutils.MyLogger;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestBaseClass {

    //public WebDriver webDriver;
    public WebDriver driver;
    public WebDriverWait wait;
    public Pages page;
    public MyEnvironment testEnvironment;

    @BeforeMethod
    public void beforeOwnMethod(Method method) {
        String methodName = method.getName();
        MyLogger.info("test case name: " + methodName);
        driver=MyDriverManager.getDriver();
        if (driver==null) {
            MyDriverManager.setWebDriver(MyDriverFactory.getDriver(testEnvironment.getBroswer()));
            driver= MyDriverManager.getDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            page = new Pages(driver);
            driver.get(testEnvironment.url());
        }


    }
    
    @BeforeTest
    @Parameters({"environment"})
    public void beforeTest(String environemnt) {
        ConfigFactory.setProperty("env", environemnt);
        testEnvironment = ConfigFactory.create(MyEnvironment.class);
    }
    

    @AfterMethod
    public void afterMethod(){
        MyDriverManager.closeDriver();
       
    }



}
