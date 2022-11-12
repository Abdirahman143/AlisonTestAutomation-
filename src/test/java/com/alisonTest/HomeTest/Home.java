package com.alisonTest.HomeTest;

import com.alison.pages.Home.HomePage;
import com.alison.pages.Login.LoginPage;
import com.alisonTest.Base.BrowserBase;

public class Home extends BrowserBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();


    public void LoginBtn(){
        loginPage =homePage.ClickLoginBtn(driver);
    }
}
