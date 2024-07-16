package com.resolver.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 extends TestBase{
	
	@Test
	public void testsix() throws InterruptedException {
		// Open chrome browser
		WebDriverManager.chromedriver().setup();

		// Maximize the window opened
		driver.manage().window().maximize();
		
		// Navigate to webpage url that is given
		driver.get("file:///C:/Users/Siva/Downloads/AutomationChallenge_2022/QE-index.html");
		
		// Scrolling down the page till the element is found
		WebElement test5_heading= driver.findElement(By.xpath("//h1[text()='Test 5']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;	
        js.executeScript("arguments[0].scrollIntoView();", test5_heading);
        
        // Use the method to find the value of the cell at coordinates 2, 2 (staring at 0 in the top left corner)
        //TestBase table= new TestBase();
        Thread.sleep(9000);
        String cellValue= getCellValue(2,2);
        System.out.println(cellValue);
        
        // Assert that the value of the cell is "Ventosanzap"
        Assert.assertEquals("Ventosanzap",cellValue);    
        
	}

}
