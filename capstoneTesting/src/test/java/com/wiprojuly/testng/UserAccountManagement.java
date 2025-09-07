package com.wiprojuly.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class UserAccountManagement {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }
//    
//    @Test(priority = 1)
//    public void SignUp() throws InterruptedException {
//        driver.findElement(By.id("signin2")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("sign-username")).sendKeys("naman04"); // replace with real username
//        Thread.sleep(2000);
//        driver.findElement(By.id("sign-password")).sendKeys("Admin@123");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
//        Thread.sleep(2000);
//
////        String username = driver.findElement(By.id("nameofuser")).getText();
////        Assert.assertTrue(username.contains(""), "User should be logged in");
//
//    }

    @Test(priority = 2)
    public void login() throws InterruptedException {
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).sendKeys("nagendra04"); // replace with real username
        Thread.sleep(2000);
        driver.findElement(By.id("loginpassword")).sendKeys("Admin@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(2000);
//
//        String username = driver.findElement(By.id("nameofuser")).getText();
//        Assert.assertTrue(username.contains("Welcome"), "User should be logged in");
        
        

    }

    @Test(priority = 3)
    public void verifyNoForgotPassword() {
        boolean hasForgot = driver.getPageSource().toLowerCase().contains("forgot");
        Assert.assertFalse(hasForgot, "Site should not contain 'forgot password' link");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
