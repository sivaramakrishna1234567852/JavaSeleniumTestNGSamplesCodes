package com.resolver.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	// Create chrome driver object
	 WebDriver driver= new ChromeDriver();
	
	// Write a method that allows you to find the value of any cell on the grid
	String getCellValue(int rowNum, int colNum) {
		String rownum= Integer.toString(rowNum+1);
		String colnum= Integer.toString(colNum+1);
		WebElement locator= driver.findElement(By.xpath("//table/tbody/tr["+rownum+"]/td["+colnum+"]"));
		return locator.getText();
	}
	
	@BeforeClass
	public void openbrowserUrl() {
		
		       // Open chrome browser
				WebDriverManager.chromedriver().setup();	
				
				// Maximize the window opened
				driver.manage().window().maximize();
				
				// Navigate to webpage url that is given
				driver.get("file:///C:/Users/Siva/Downloads/AutomationChallenge_2022/QE-index.html");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
