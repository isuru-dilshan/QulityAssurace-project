package com.patricals.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_1 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isuru Dilshan\\Desktop\\SelenumTest\\Chromedriver\\chromedriver98.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Isuru%20Dilshan/Downloads/Selenium%20Practical%20Resource%20Materials-20220205/Question%201.html");
		
		// FirstNameTextBox
		WebElement FirstNameTextBox = driver.findElement(By.name("fname"));
		FirstNameTextBox.sendKeys("Isuru");
		Thread.sleep(3000);
		
		// LastNameTextBox
		WebElement LastNameTextBox  =driver.findElement(By.name("lname"));
		LastNameTextBox.sendKeys("Dilshan");
		Thread.sleep(3000);
		
		// RadioButton
		
		WebElement RadioButton_1 = driver.findElement(By.xpath("/html/body/form/div[1]/p[3]/input[1]"));
		WebElement RadioButton_2 = driver.findElement(By.xpath("/html/body/form/div[1]/p[3]/input[2]"));
		
		RadioButton_1.click();
		Thread.sleep(3000);
		
		if(RadioButton_1.isSelected()) {
			System.out.println("Option 1 Radio Button has been Selected");
		}
		
		else {
			System.out.println("Option 2 Radio Button has been Selected");
		}
		
		// Next Button_1
		WebElement NextButton_1 = driver.findElement(By.id("nextBtn"));
		NextButton_1.click();
		Thread.sleep(3000);
		
		// Second Page -------
		
		// EmailTextBox
		WebElement EmailTextbox = driver.findElement(By.name("email"));
		EmailTextbox.sendKeys("isurudilshan@gmail.com");
		Thread.sleep(3000);
		
		// Phone
		WebElement Phone = driver.findElement(By.name("phone"));
		Phone.sendKeys("0776789234");
		Thread.sleep(3000);
		
		// Next Button_2
		WebElement NextButton_2 = driver.findElement(By.id("nextBtn"));
		NextButton_2.click();
		Thread.sleep(3000);
		
		// Third Page ---------
		
		// DateTextBox
		
		WebElement DateTextBox = driver.findElement(By.name("dd"));
		DateTextBox.sendKeys("31");
		Thread.sleep(3000);
		
		// MonthTextBox
		
		WebElement MonthTextBox = driver.findElement(By.name("nn"));
		MonthTextBox.sendKeys("05");
		Thread.sleep(3000);
		
		// YearTextBox
		
		WebElement YearTextBox = driver.findElement(By.name("yyyy"));
		YearTextBox.sendKeys("1999");
		Thread.sleep(3000);
		
		// Next Button_3
		
		WebElement NextButton_3 = driver.findElement(By.id("nextBtn"));
		NextButton_3.click();
		Thread.sleep(3000);
		
		// Fourth Page
		
		// User Name Text Box
		
		WebElement UserNameTextBox = driver.findElement(By.name("uname"));
		UserNameTextBox.sendKeys("Isuru Dilshan");
		Thread.sleep(3000);
		
		// Password Text Box
		
		WebElement PasswordTextBox = driver.findElement(By.name("pword"));
		PasswordTextBox.sendKeys("123456");
		Thread.sleep(3000);
		
		// Submit Button
		
		WebElement SubmitButton = driver.findElement(By.id("nextBtn"));
		SubmitButton.click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
        
   }
	
}
