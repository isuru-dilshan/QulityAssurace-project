package com.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatricalTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isuru Dilshan\\Desktop\\SelenumTest\\Chromedriver\\chromedriver98.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		WebElement  UserNameText = driver.findElement(By.id("user-name"));
		UserNameText.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		WebElement UserPasswordText = driver.findElement(By.id("password"));
		UserPasswordText.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		
		WebElement AddToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddToCart.click();
		
		
		

	}

}
