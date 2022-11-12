package com.alisonTest.LoginTest;

import com.alison.pages.Home.HomePage;
import com.alison.pages.Login.LoginPage;
import com.alisonTest.Base.BrowserBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login extends BrowserBase {

   HomePage homePage =new HomePage();

   @BeforeSuite
   public void initialize(){
       Browser();
       SetUp();
   }

   @Test
    public void Logo(){
        Assert.assertTrue(homePage.verifyLogo(driver));

    }
}
