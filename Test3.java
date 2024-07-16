package com.resolver.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class Test3 {
	
	@Test
	public void testthree() throws InterruptedException {
		
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
        
        // In the test 3 div, assert that "Option 1" is the default selected value
        String default_select_option_text = dropdown.getText();
        Assert.assertEquals("Option 1",default_select_option_text);

        
        // Pause execution for 5 sec to oberserve dropdown
        Thread.sleep(5000);
        
        // Select "Option 3" from the select list
        dropdown.click();
        
        // Pause execution for 5 sec to oberserve dropdown menu
        Thread.sleep(5000);
        WebElement third_option= driver.findElement(By.xpath("(//a[@class=\"dropdown-item\"])[3]"));
        third_option.click();
        
        // Pause execution for 5 sec to observe option3 is selected.
        Thread.sleep(5000);
        
        // Close web browser
        driver.close();
		
	}

}
