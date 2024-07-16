package com.resolver.challenge;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {
	
	@Test
	public void testfive() {
		
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
        
        //In the test 5 div, wait for a button to be displayed (note: the delay is random) and then click it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"btn btn-lg btn-primary\"])[2]")));
		WebElement button=driver.findElement(By.xpath("(//button[@class=\"btn btn-lg btn-primary\"])[2]"));
		button.click();
		
		// Once you've clicked the button, assert that a success message is displayed
		Boolean alertMsg=driver.findElement(By.id("test5-alert")).isDisplayed();
		Assert.assertTrue(alertMsg);
		
		// Assert that the button is now disabled
		Assert.assertFalse(button.isEnabled());
		
		// Close web browser
        driver.close();
	}

}
