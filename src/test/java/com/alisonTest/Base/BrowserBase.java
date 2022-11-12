package com.alisonTest.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserBase {

    public static WebDriver driver;
    public static Properties prop;

    public static void Browser(){

        try{
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/java/com/alison/configuration/config.properties");
             prop.load(fis);
            System.out.println("after loading files");

        } catch (IOException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public static void SetUp(){
        System.out.println("after the browser");

        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().cachePath("src/main/java/com/alison/drivers");
            driver = new ChromeDriver();

        }

        else if (prop.getProperty("browser").equalsIgnoreCase("FF")){
            WebDriverManager.firefoxdriver().cachePath("src/main/java/com/alison/drivers").setup();
            driver = new FirefoxDriver();
        }
        else if (prop.getProperty("browser").equalsIgnoreCase("EE")){
            WebDriverManager.edgedriver().cachePath("src/main/java/com/alison/drivers").setup();
            driver =new EdgeDriver();
        }
        System.out.println("Before Drier");
        driver.navigate().to(prop.getProperty("url"));
        System.out.println("After the driver");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

    }
}
