package com.mytest;

import com.mypages.HomePage;
import com.mypages.LoginPage;
import com.mypages.TestBaseClass;
import com.myutils.MyLogger;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBaseClass{

    @Test
    //Positive Test
    
    public void verify_user_is_able_to_login()
    {
      page.getPageObject(LoginPage.class).loginToHome(testEnvironment.username(), testEnvironment.password());
      Assert.assertEquals(page.getPageObject(HomePage.class).getUserName(),"auto user");
      
    }
    
  //Negative Test
    @Test
    public void verify_when_email_id_is_wrong()
    {
    	MyLogger.info("Google1 Test Started! " + Thread.currentThread().getId());
    
      page.getPageObject(LoginPage.class).loginToHome("abc@gmail.com", "123456");
      Assert.assertEquals(page.getPageObject(HomePage.class).getError(),"There is 1 error");
    }
  //Negative Test
    @Test
    public void verify_When_password_id_is_wrong()
    {
    	MyLogger.info("Google1 Test Started! " + Thread.currentThread().getId());
    	
      page.getPageObject(LoginPage.class).loginToHome("abc_123456@gmail.com", "34324");
      Assert.assertEquals(page.getPageObject(HomePage.class).getError(),"There is 1 error");
    }
    
  //Negative Test
    @Test
    public void verify_when_both_emailid_and_password_id_are_wrong()
    {
    	MyLogger.info("Google1 Test Started! " + Thread.currentThread().getId());
      page.getPageObject(LoginPage.class).loginToHome("abc@gmail.com", "34324");
      Assert.assertEquals(page.getPageObject(HomePage.class).getError(),"There is 1 error");
    }
    
    
}
