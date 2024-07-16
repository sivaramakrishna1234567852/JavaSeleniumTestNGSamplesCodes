package com.resolver.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	public void testone() {
		
		// open chrome browser
		WebDriverManager.chromedriver().setup();	
		
		// create  chrome driver object
		WebDriver driver = new ChromeDriver();
		
		// Maximize the chrome tab that is opened
		driver.manage().window().maximize();
		
		// Navigate to webpage url that is given
		driver.get("file:///C:/Users/Siva/Downloads/AutomationChallenge_2022/QE-index.html");
		
		// verify signin button is diaplayed in page
		Boolean signbtn=driver.findElement(By.xpath("//button[text()='Sign in']")).isDisplayed();
		Assert.assertTrue(signbtn);
		
		// verify email input field is displayed in webpage
		Boolean email_input_field= driver.findElement(By.xpath("//input[@id=\"inputEmail\"]")).isDisplayed();
		Assert.assertTrue(email_input_field);
		
		// verify password input filed is displayed in webpage
		Boolean pwd_input_field= driver.findElement(By.xpath("//input[@id=\"inputPassword\"]")).isDisplayed();
		Assert.assertTrue(pwd_input_field);
		
		// Enter email in to email field
		driver.findElement(By.id("inputEmail")).sendKeys("sunkarasivaramkrishna@gmail.com");
		
		// Enter password in to password field
		driver.findElement(By.id("inputPassword")).sendKeys("Hello@world12345");
		
		// Close web browser
		driver.close();
		
	}
	

}
