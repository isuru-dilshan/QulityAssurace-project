package com.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isuru Dilshan\\Desktop\\SelenumTest\\Chromedriver\\chromedriver98.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.PHPTravels.com");
		
		WebElement PHPTravelDemo = driver.findElement(By.xpath("/html/body/header/div/nav/a[1]"));
		PHPTravelDemo.click();
		
		Thread.sleep(3000);
		
		WebElement CustomerForntEnd = driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small"));
        CustomerForntEnd.click();
        
        Thread.sleep(3000);
        
         driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        
        WebElement
	}

}
