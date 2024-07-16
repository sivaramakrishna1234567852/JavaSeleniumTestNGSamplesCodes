package com.resolver.challenge;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	
	@Test
	public void testfour() throws InterruptedException {
		       // Open chrome browser
				WebDriverManager.chromedriver().setup();
				
				// Create chrome driver object
				WebDriver driver= new ChromeDriver();
				
				// Maximize the window opened
				driver.manage().window().maximize();
				
				// Navigate to webpage url that is given
				driver.get("file:///C:/Users/Siva/Downloads/AutomationChallenge_2022/QE-index.html");
				
				// Scrolling down the page till the element is found
				WebElement dropdown= driver.findElement(By.id("dropdownMenuButton"));
				JavascriptExecutor js = (JavascriptExecutor) driver;	
		        js.executeScript("arguments[0].scrollIntoView();", dropdown);
		        
		        // Pause execution for 5 sec to oberserve dropdown
		        Thread.sleep(5000);
		        
		        // In the test 4 div, assert that the first button is enabled 
		        Boolean button_enabled=driver.findElement(By.xpath("(//div/button[@class=\"btn btn-lg btn-primary\"])[1]")).isEnabled();
		        Assert.assertTrue(button_enabled);
		        
		        // In the test 4 div, assert that the second button is disabled
		        Boolean button_disabled=driver.findElement(By.xpath("//div/button[@class=\"btn btn-lg btn-secondary\"]")).isEnabled();
		        Assert.assertFalse(button_disabled);
		        
		        // Close web browser
		        driver.close();
	}

}
