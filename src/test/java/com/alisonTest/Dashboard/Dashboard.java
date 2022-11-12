package com.alisonTest.Dashboard;

import com.alison.pages.Dashboard.DashboardPage;
import com.alison.pages.Login.LoginPage;
import com.alisonTest.Base.BrowserBase;

public class Dashboard  extends BrowserBase {
    DashboardPage dashboardPage =new DashboardPage();
    LoginPage loginPage = new LoginPage();


    public void ClickLoginBtn(){
        dashboardPage = loginPage.ClickLogIn(driver);
    }
}
