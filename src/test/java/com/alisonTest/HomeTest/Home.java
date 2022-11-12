package com.alisonTest.HomeTest;

import com.alison.pages.Home.HomePage;
import com.alison.pages.Login.LoginPage;
import com.alisonTest.Base.BrowserBase;
import org.testng.Assert;

public class Home extends BrowserBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();


    public void LoginBtn(){
        loginPage =homePage.ClickLoginBtn(driver);
    }

    public void verifyTitle(){
        String expected = "Welcome Back!";
        String actual = loginPage.verifyTitle(driver);
        Assert.assertEquals(actual,expected);

    }

    public void  ClickEmail(){
        loginPage.ClickEmail(driver,"abdirahman.bashir88gmail.com");
    }
    public void ClickPassword(){
        loginPage.EnterPassword(driver,"Abdi12345");
    }
}
