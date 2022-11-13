package com.alisonTest.Dashboard;

import com.alison.pages.Dashboard.DashboardPage;
import com.alison.pages.Login.LoginPage;
import com.alisonTest.Base.BrowserBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboard  extends BrowserBase {
    DashboardPage dashboardPage =new DashboardPage();
    LoginPage loginPage = new LoginPage();


    @Test(priority = 0)
    public void ClickLoginBtn(){
        dashboardPage = loginPage.ClickLogIn(driver);
    }
      @Test(priority = 1)
    public void verifyProfile()  {
        String expected ="Abdirahman Abdi";
       String actual= dashboardPage.VerifyProfileName(driver);

        Assert.assertEquals(actual,expected);

    }
}
