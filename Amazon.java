package com.resolver.challenge;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.resolver.pages.ResolverPage;

public class Amazon extends TestBasee{
	
	@Test
	public void verifyMobileSpecification() throws InterruptedException {
		
		// Create amazon page object to use its methods
		Thread.sleep(3000);
		ResolverPage amazon_page= new ResolverPage(driver);
		Thread.sleep(3000);
		
		// Click on all hamburger menu
		amazon_page.menuBar().click();
		Thread.sleep(3000);
		
		// Using javascript executor to scroll to mobile and computers option
		JavascriptExecutor js = (JavascriptExecutor) driver;	
        js.executeScript("arguments[0].scrollIntoView();", amazon_page.mobileComputersMenu());
        Thread.sleep(3000);
        
        // Click on mobile and computers menu
		amazon_page.mobileComputersMenu().click();
		Thread.sleep(3000);
		
		 // Click on all mobile phones option using javascript executer
		js.executeScript("arguments[0].click()", amazon_page.allMobilesOption());
		Thread.sleep(3000);
		
		// Enter mobile name in search feild of amazom page and click search button
		amazon_page.getSearchBox().sendKeys("OnePlus 11 5G");
		Thread.sleep(3000);
		amazon_page.getSearchSubmitBtn().click();
		Thread.sleep(3000);
		
		// Click on first search result
		amazon_page.getFirstSearchResult().click();
		Thread.sleep(3000);
		
		// Verify all mobile specifications are displayed on page
		// hold all window handles in array list
	    ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	    
	    //switch to new tab
	    driver.switchTo().window(newTb.get(1));
	    Thread.sleep(3000);
	    
	    // Scroll to specification section	
        js.executeScript("arguments[0].scrollIntoView();", amazon_page.getFirstSpecificationName());
        Thread.sleep(3000);
	    
	    // Verify 1st specification is displayed or not
	   String spec_name_1 = amazon_page.getFirstSpecificationName().getText();
	   String spec_value_1 = amazon_page.getFirstSpecificationValue().getText();
	   Assert.assertTrue(spec_name_1.equals("Brand") && spec_value_1.equals("OnePlus"));
	   System.out.println(spec_name_1+" "+spec_value_1);
	   Thread.sleep(3000);
	   
	   // Verify 2nd specification is displayed or not
	   String spec_name_2 = amazon_page.getSecondSpecificationName().getText();
	   String spec_value_2 = amazon_page.getSecondSpecificationValue().getText();
	   Assert.assertTrue(spec_name_2.equals("Model Name") && spec_value_2.equals("OnePlus 11 5G"));
	   System.out.println(spec_name_2+" "+spec_value_2);
	   Thread.sleep(3000);
	   
	   // Verify 3rd specification is displayed or not
	   String spec_name_3 = amazon_page.getThirdSpecificationName().getText();
	   String spec_value_3 = amazon_page.getThirdSpecificationValue().getText();
	   Assert.assertTrue(spec_name_3.equals("Network Service Provider") && spec_value_3.equals("Unlocked for All Carriers"));
	   System.out.println(spec_name_3+" "+spec_value_3);
	   Thread.sleep(3000);
	   
	   // Verify 4th specification is displayed or not
	   String spec_name_4 = amazon_page.getFourSpecificationName().getText();
	   String spec_value_4 = amazon_page.getFourSpecificationValue().getText();
	   Assert.assertTrue(spec_name_4.equals("Operating System") && spec_value_4.equals("OxygenOS"));
	   System.out.println(spec_name_4+" "+spec_value_4);
	   Thread.sleep(3000);
	   
	   // Verify 5th specification is displayed or not
	   String spec_name_5 = amazon_page.getFiveSpecificationName().getText();
	   String spec_value_5 = amazon_page.getFiveSpecificationValue().getText();
	   Assert.assertTrue(spec_name_5.equals("Cellular Technology") && spec_value_5.equals("5G, 4G LTE"));
	   System.out.println(spec_name_5+" "+spec_value_5);
	   Thread.sleep(3000);
	
	
	}
	

}
