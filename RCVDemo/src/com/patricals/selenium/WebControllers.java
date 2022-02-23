package com.patricals.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebControllers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isuru Dilshan\\Desktop\\SelenumTest\\Chromedriver\\chromedriver98.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Isuru%20Dilshan/Downloads/Selenium%20Practical%20Resource%20Materials-20220205/Selenium%20Web%20Controllers.html");
		
		WebElement RadioButton_1 = driver.findElement(By.id("vfb-7-1"));
		WebElement RadioButton_2 = driver.findElement(By.id("vfb-7-2"));
		WebElement RadioButton_3 = driver.findElement(By.id("vfb-7-3"));
		
		RadioButton_3.click();
		
		if (RadioButton_1.isSelected()) {
			
			System.out.println("Option 1 Radio Button has selected");
		}
		
		else if(RadioButton_2.isSelected()) {
			System.out.println("Option 2 Radio Button has selected");
		}
		
		else if(RadioButton_3.isSelected()) {
			System.out.println("Option 3 Radio Button has selected");
		}
		
		else {
			System.out.println(" Radio Button has not selcted");
		}
		
		WebElement CheckBox_1 = driver.findElement(By.id("vfb-6-0"));
		WebElement CheckBox_2 = driver.findElement(By.id("vfb-6-1"));
		WebElement CheckBox_3 = driver.findElement(By.id("vfb-6-2"));
		
		CheckBox_3.click();
		
		if (CheckBox_1.isSelected()) {
			System.out.println("Option 1 Check Button has selected");
		}
		else if (CheckBox_2.isSelected()) {
			System.out.println("Option 2 Check Button has selected");
		}
		else {
			System.out.println("Option 3 Check Button has selected");
		}
		
		// Combo Box
		
		Select ComboBox = new Select(driver.findElement(By.id("fruits")));
		
		// option 1 = select by visible text
		ComboBox.selectByVisibleText("Orange");
		// option 2 = select by Index
		ComboBox.selectByIndex(0);
		
		// Drop down automation
		
		Select dropDown = new Select(driver.findElement(By.name("country")));
		dropDown.selectByVisibleText("ANGOLA");
		
		// Submit Button
		
		WebElement SubmitButton = driver.findElement(By.xpath("/html/body/input[1]"));
		SubmitButton.click();
		
		// User Text Box
		
		WebElement UserTextBox = driver.findElement(By.name("userName"));
		UserTextBox.sendKeys("Isuru Dilshan");
		
		// HyperLinks
		
		driver.findElement(By.linkText("your destination")).click();
		
	}

}
