package com.patricals.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isuru Dilshan\\Desktop\\SelenumTest\\Chromedriver\\chromedriver98.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		// User E-mail Text Box
		
		WebElement UserEmailTextBox = driver.findElement(By.id("user-name"));
		UserEmailTextBox.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		// User Password
		
		WebElement UserPassword = driver.findElement(By.id("password"));
		UserPassword.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		// Login Button
		
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();
		
		Thread.sleep(3000);
		
		// Change the tab focus to new tab
		
		driver.getWindowHandles().forEach(tab-> driver.switchTo().window(tab));
		
		
	}

}
