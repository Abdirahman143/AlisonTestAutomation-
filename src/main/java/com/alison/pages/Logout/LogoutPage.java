package com.alison.pages.Logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {

    By profile = By.xpath("/html/body/section/header/div[2]/div[3]/span[2]/span/img");
    By LogoutBtn = By.xpath("//*[@id=\"mCSB_5_container\"]/div/ul/li[9]/a/span/img");
    By confirmHomePage = By.xpath("//*[@id=\"homepage\"]/div[1]/div/h1");
    WebDriver driver;

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

    public void ClickProfile(WebDriver driver){
     wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(profile)));
        driver.findElement(profile).click();

    }

    public void ClickLogout(WebDriver driver ){
        driver.findElement(LogoutBtn).click();
    }

    public String Confirmation(WebDriver driver){
       return driver.findElement(confirmHomePage).getText();
    }


}
