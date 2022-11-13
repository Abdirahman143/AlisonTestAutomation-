package com.alisonTest.LogoutTest;

import com.alison.pages.Logout.LogoutPage;
import com.alisonTest.Base.BrowserBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends BrowserBase {
    LogoutPage logoutPage = new LogoutPage();

    @Test(priority = 0)
    public void ClickProfile(){
        logoutPage.ClickProfile(driver);
    }

    @Test(priority = 1)
    public void ClickLogout(){
        logoutPage.ClickLogout(driver);
    }

    @Test(priority = 2)
    public void Confirm(){
       String actual = logoutPage.Confirmation(driver);
       String expected = "Free Online Courses With Certificates & Diplomas";
        Assert.assertEquals(actual, expected);
    }


}
