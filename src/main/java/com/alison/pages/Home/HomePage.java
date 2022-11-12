package com.alison.pages.Home;

import com.alison.pages.Login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    By logo = By.xpath("//*[@id=\"alison_logo\"]/img");
    By loginBtn = By.xpath("/html/body/section/header/div[2]/div[3]/div[2]/a[1]");


    public boolean verifyLogo(WebDriver driver){
       return driver.findElement(logo).isDisplayed();
    }

    public LoginPage ClickLoginBtn(WebDriver driver){
        driver.findElement(loginBtn).click();
        return  new LoginPage();
    }
}
