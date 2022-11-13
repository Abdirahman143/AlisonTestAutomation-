package com.alison.pages.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    By profileName = By.xpath("//*[@id=\"dashboard\"]/div[1]/div/div/div[2]/div/h4");



    public String VerifyProfileName(WebDriver driver){
        return  driver.findElement(profileName).getText();
    }
}
