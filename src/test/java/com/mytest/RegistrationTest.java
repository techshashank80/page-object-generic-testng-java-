package com.mytest;

import com.mypages.HomePage;
import com.mypages.LoginPage;
import com.mypages.RegisterPage;
import com.mypages.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBaseClass {

    @Test
    //Positive Test
    public void regTest()
    {
       
        page.getPageObject(RegisterPage.class).goToRegistrationPage();
        page.getPageObject(RegisterPage.class).registerUser();
        Assert.assertEquals(page.getPageObject(HomePage.class).getUserName(),"Hi, Mike Lee");
    }
}
