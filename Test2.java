package com.resolver.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	
	@ Test
	public void testtwo() {
		
    // Open chrome browser
	WebDriverManager.chromedriver().setup();
	
	// Create chrome driver object
	WebDriver driver= new ChromeDriver();
	
	// Maximize the window opened
	driver.manage().window().maximize();
	
	// Navigate to webpage url that is given
	driver.get("file:///C:/Users/Siva/Downloads/AutomationChallenge_2022/QE-index.html");
	
	// verify In the test 2 div, assert that there are three values in the listgroup
	int no_of_values= driver.findElements(By.xpath("//li[@class=\"list-group-item justify-content-between\"]")).size();
	Assert.assertEquals(3,no_of_values);
	
	// Assert that the second list item's value is set to "List Item 2"
	WebElement secondlist_element= driver.findElement(By.xpath("(//li[@class=\"list-group-item justify-content-between\"])[2]"));
	String secondlist_element_text= secondlist_element.getText();
	Assert.assertEquals("List Item 2 6", secondlist_element_text);
	
	// Assert that the second list item's badge value is 6
	WebElement secondlist_element_badge= driver.findElement(By.xpath("(//span[@class=\"badge badge-pill badge-primary\"])[2]"));
	String secondlist_element_badge_value= secondlist_element_badge.getText();
	Assert.assertEquals("6", secondlist_element_badge_value);
	
	
	// Close web browser
	driver.close();
	
	
	
	

}
}
