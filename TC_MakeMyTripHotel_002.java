package com.qa.testscripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.MakeMyTripHotelPage;
import com.qa.utility.excelUtility;

public class TC_MakeMyTripHotel_002 extends TestBase{
	@Test(dataProvider="getData")
	public void HotelModule(String city,String age) throws InterruptedException, IOException {
		Thread.sleep(2000);
		String parent1=driver.getWindowHandle();
		Thread.sleep(2000);
		MakeMyTripHotelPage hotelPage=new MakeMyTripHotelPage(driver);
		Thread.sleep(2000);
		hotelPage.getClickHotelmenu().click();
		Thread.sleep(2000);
		String urlHotelHomePage=driver.getCurrentUrl();

		if(urlHotelHomePage.contains("https://www.makemytrip.com/hotels/"))//https://www.makemytrip.com/hotels/
		{
			Reporter.log("Application is navigated to hotels home page ", true);
			sAssert.assertTrue(true);	
		}
		else
		{  
			captureSS(driver,"HotelModule");
			Reporter.log("Application is not navigated to hotels home page ", true);
			sAssert.assertTrue(false);
		}
		hotelPage.getClickEnterCity().click();
		Thread.sleep(3000);
		hotelPage.getCityNameEnterField().sendKeys(city);
		Thread.sleep(3000);
		//c2
		hotelPage.getclickcityFromSuggestion().click();
		Thread.sleep(3000);
		hotelPage.getclickCheckinDate().click();
		Thread.sleep(3000);
		hotelPage.getCheckindate().click();
		hotelPage.getCheckOutDate().click();
		hotelPage.getAddGuestsRooms().click();
		Thread.sleep(3000);
		hotelPage.getAdultsCount().click();
		Thread.sleep(3000);
		hotelPage. getChildrenCount().click();
		Thread.sleep(3000);
		hotelPage.getClickAddChildAge().sendKeys(age);
		Thread.sleep(3000);
		hotelPage.getApplyBotton().click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		hotelPage.getHotelSearchButton().click();
		Thread.sleep(3000);
		String urlHotelListingPage=driver.getCurrentUrl();
		if( urlHotelListingPage.contains("hotel-listing"))
		{
			Reporter.log("Application is navigated to hotel-listing page ", true);
			sAssert.assertTrue(true);	
		}
		else
		{   captureSS(driver,"HotelModule");
			Reporter.log("Application is not navigated to hotel-listing page ", true);
			sAssert.assertTrue(false);
		}
		Thread.sleep(3000);
		hotelPage.getSelectHotel().click();
		Thread.sleep(2000);
		Set<String> allWindows1=driver.getWindowHandles();
		for(String child:allWindows1) {
			if(!parent1.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				String urlHotelDetailPage=driver.getCurrentUrl();
				if(urlHotelDetailPage.contains("hotel-details"))
				{
					Reporter.log("Application is navigated to hotel details page ", true);
					sAssert.assertTrue(true);	
				}
				else
				{  captureSS(driver,"HotelModule");
					Reporter.log("Application is not navigated to hotel details page ", true);
					sAssert.assertTrue(false);
				}
				Thread.sleep(2000);
				/*
				 * hotelPage.getCLickGoToRooms().click(); Thread.sleep(2000);
				 * hotelPage.getClickSelectRoom().click();
				 */
				hotelPage.getBookThisNowButton().click();
				Thread.sleep(2000);
				String urlHotelReviewPage=driver.getCurrentUrl();
				if(urlHotelReviewPage.contains("review"))
				{
					Reporter.log("Application is navigated to hotel Review page ", true);
					sAssert.assertTrue(true);	
				}
				else
				{  
					captureSS(driver,"HotelModule");
					Reporter.log("Application is not navigated to hotel Review page ", true);
					sAssert.assertTrue(false);
				}
				Thread.sleep(2000);
				hotelPage.getBookingForRadioBtn().click();
				Thread.sleep(2000);
				hotelPage.getEnterFirstNameField().clear();
				//prop.getProperty("password")
				hotelPage.getEnterFirstNameField().sendKeys(prop.getProperty("firstName"));
				Thread.sleep(2000);
				hotelPage.getEnterLastNameField().sendKeys(prop.getProperty("lastName"));
				Thread.sleep(2000);
				hotelPage.getAddTripInsuranceBtn().click();
				Thread.sleep(2000);
				hotelPage.getClickPayNowBtn().click();
				Thread.sleep(2000);
				String urlHotelPaymentPage=driver.getCurrentUrl();
				if(urlHotelPaymentPage.contains("checkout"))
				{
					Reporter.log("Application is navigated to payment page ", true);
					sAssert.assertTrue(true);	
				}
				else
				{  
					captureSS(driver,"HotelModule");
					Reporter.log("Application is not navigated to payment page ", true);
					sAssert.assertTrue(false);
				}
			}
		}
		driver.switchTo().window(parent1);
	}
	
	@DataProvider(name="getData")
	public String[][] getData() throws IOException
	{
		
		String xFile ="C:\\Users\\Siva\\eclipse-workspace\\TestAutomation.MakeMyTrip\\src\\test\\java\\com\\qa\\testdata\\TestDataHotel.xlsx";
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
