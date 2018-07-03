package com.mytest;

import org.testng.Assert;

import com.mypages.AccountPage;
import com.mypages.HomePage;
import com.mypages.LoginPage;
import com.mypages.TestBaseClass;
import com.myutils.MyLogger;

public class UserAddressTest extends TestBaseClass {

	 public void verify_user_address_functionlity()
	    {
		  MyLogger.info("Google1 Test Started! " + Thread.currentThread().getId());
	      page.getPageObject(LoginPage.class).loginToHome("smartboydear@gmail.com", "123456");
	      page.getPageObject(AccountPage.class).gotoAddressPage();
	      
	     
	    }
}
