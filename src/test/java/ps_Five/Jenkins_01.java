package ps_Five;

//public class Jenkins_01 {

//}

//package com.selenium.Selenium_S2_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkins_01 {
    WebDriver driver;
    
    @BeforeTest
    public void setUp() {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
        // Initialize WebDriver
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Open the URL
        driver.get("https://demowebshop.tricentis.com/");
    }
    
    @Test
    public void testLogin() {
        // Find and click on the login link
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();
        
        // Find the email text box and enter email
        WebElement emailTextBox = driver.findElement(By.id("Email"));
        emailTextBox.sendKeys("user4444@gmail.com");
        
        // Find the password text box and enter password
        WebElement passwordTextBox = driver.findElement(By.id("Password"));
        passwordTextBox.sendKeys("abcd1234");
        
        // Find and click on the login button
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        loginButton.click();
        
        // Verify login success by checking the presence of logout link
        //WebElement logoutLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        //Assert.assertTrue(logoutLink.isDisplayed(), "Login unsuccessful");
    }
    
    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}


