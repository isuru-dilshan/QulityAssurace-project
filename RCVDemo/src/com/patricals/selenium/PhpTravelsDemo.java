package com.patricals.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isuru Dilshan\\Desktop\\SelenumTest\\Chromedriver\\chromedriver98.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.com");
		
		// Select Demo Button
		
		WebElement UserDemo = driver.findElement(By.xpath("/html/body/header/div/nav/a[1]"));
		UserDemo.click();
		
		Thread.sleep(3000);
		
		WebElement UserLogin = driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small"));
		UserLogin.click();
		
		Thread.sleep(3000);
		
		// User Email
		
		WebElement UserEmail = driver.findElement(By.name("email"));
		UserEmail.sendKeys("user@phptravels.com");
		
		Thread.sleep(3000);
		
		// User Password
		
		WebElement UserPassord = driver.findElement(By.name("password"));
		UserPassord.sendKeys("demouser");
		
		Thread.sleep(3000);
		
		// Login Button
		
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		LoginButton.click();
		
		// My Profile
		
		WebElement MyProfile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
		MyProfile.click();
		
		// Profile Name
		
		WebElement ProfileName = driver.findElement(By.name("firstname"));
		ProfileName.sendKeys("Isuru");
		
		// Last Name
		
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Dilshan");
		
		// Phone
		
		WebElement Phone = driver.findElement(By.name("phone"));
		Phone.sendKeys("phone");
		
		// DropDawn box
		
		Select DropDawn = new Select(driver.findElement(By.id("select2-from_country-container")));
		DropDawn.selectByVisibleText("Australia");
		
		
	}

}
