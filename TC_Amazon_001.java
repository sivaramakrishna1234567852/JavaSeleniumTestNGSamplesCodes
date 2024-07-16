package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.pages.AmazonPage;
import com.qa.utility.excelUtility;

public class TC_Amazon_001 extends TestBase{
	//WebDriver driver;
	
	@Test(dataProvider="getData")
	public void books(String category,String searchitem){
	AmazonPage amazonpage=new AmazonPage(driver);
	amazonpage.getBooksLink().sendKeys(category);
	amazonpage.getTextBox().clear();
	amazonpage.getTextBox().sendKeys(searchitem);
	amazonpage.getSearchButton().click();
	
	boolean contains=driver.getTitle().contains(searchitem);
	if(contains) {
		//System.out.println("Page Titles is as Items loaded");
		Reporter.log("Page Title is same as Items loaded",true);
		Assert.assertTrue(contains);
		
	}else {
		//System.out.println("Page Titles is as Items loaded");
		Reporter.log("Page Title is not same as Items loaded",true);
		Assert.assertTrue(contains);
	}
	System.out.println("The number of items loaded on the page " +driver.findElements(By.xpath("//h2/a/span")).size());
	System.out.println("The titles of items loaded on the page are as fallows ");
	
	java.util.List<WebElement> allLinks = driver.findElements(By.xpath("//h2/a/span"));
	
	for(WebElement Link:allLinks)
	{
		System.out.println(Link.getText());
	}
	  
	}
	
	@DataProvider(name="getData")
	public String[][] getData() throws IOException
	{
		
		String xFile ="C:\\Users\\Siva\\eclipse-workspace\\TestAutomation.AmazonSearch\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
		String xSheet = "Sheet1";
		
		int rowCount = excelUtility.getRowCount(xFile, xSheet);
		int cellCount = excelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = excelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
}
}
