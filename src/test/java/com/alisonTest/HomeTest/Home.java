package com.alisonTest.HomeTest;

import com.alison.pages.Home.HomePage;
import com.alison.pages.Login.LoginPage;
import com.alisonTest.Base.BrowserBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home extends BrowserBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();

@Test(priority = 1)
    public void LoginBtn(){
        loginPage =homePage.ClickLoginBtn(driver);
    }
@Test(priority = 2)
    public void verifyTitle(){
        String expected = "Welcome Back!";
        String actual = loginPage.verifyTitle(driver);
        Assert.assertEquals(actual,expected);

    }
@Test(priority = 3)
    public void  ClickEmail(){
        loginPage.ClickEmail(driver,"abdirahman.bashir88@gmail.com");
    }
    @Test(priority = 4)
    public void ClickPassword(){
        loginPage.EnterPassword(driver,"Abdi12345");
    }
}
