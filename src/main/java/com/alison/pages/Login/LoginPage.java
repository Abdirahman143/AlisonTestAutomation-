package com.alison.pages.Login;

import com.alison.pages.Dashboard.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    By title = By.xpath("//*[@id=\"login\"]/div[2]/span");
    By email_Txt =By.name("email");
    By password_Txt = By.name("password");
    By logIn = By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div[2]/div/form/div[3]/input");


    public String verifyTitle(WebDriver driver){
        return driver.findElement(title).getText();
    }
    public void  ClickEmail(WebDriver driver,String email){
        driver.findElement(email_Txt).click();
        driver.findElement(email_Txt).clear();
        driver.findElement(email_Txt).sendKeys(email);
    }

    public void EnterPassword(WebDriver driver, String passsword){
        driver.findElement(password_Txt).click();
        driver.findElement(password_Txt).clear();
        driver.findElement(password_Txt).sendKeys(passsword);
    }

    public DashboardPage ClickLogIn(WebDriver driver){
        driver.findElement(logIn).click();
        return new DashboardPage();
    }
}
