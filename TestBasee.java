package com.resolver.challenge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBasee {
	
	// Create chrome driver object
	 WebDriver driver= new ChromeDriver();

	
	@BeforeTest
	public void openbrowserUrl() {
		
		       // Open chrome browser
				WebDriverManager.chromedriver().setup();	
				
				// Maximize the window opened
				driver.manage().window().maximize();
				
				// Navigate to amazon india url.
				driver.get("https://www.amazon.in/");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
