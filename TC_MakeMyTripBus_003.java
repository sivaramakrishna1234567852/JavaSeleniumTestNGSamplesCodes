package com.qa.testscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.qa.pages.MakeMyTripBusPage;

public class TC_MakeMyTripBus_003 extends TestBase{
	@Test
	public void BusModule() throws InterruptedException{
		MakeMyTripBusPage buspage=new MakeMyTripBusPage(driver);

          Thread.sleep(5000);
		Thread.sleep(3000);
		buspage.getSelectBusMenu().click();
		Thread.sleep(3000);
		buspage.getclickFromCity().click();
		Thread.sleep(3000);
		buspage.getFromCity().sendKeys("Hyderabad");
		Thread.sleep(3000);
		buspage.getClickCityFromSuggestion().click();
		Thread.sleep(3000);
		//bp.getClickToCity().sendKeys("Bangalore, Karnataka");
		//Thread.sleep(3000);
		buspage.getToCity().sendKeys("Bangalore, Karnataka");
		Thread.sleep(3000);
		buspage.getClickToCity().click();
		Thread.sleep(3000);
		buspage.getClickTravelDate().click();
		buspage.getClickSearchButton().click();
		Thread.sleep(3000);
		buspage.getClickSelectSeats().click();
		Thread.sleep(3000);
		buspage.getPickUpPoint().click();
		Thread.sleep(3000);
		buspage.getDropPoint().click();
		Thread.sleep(3000);
		buspage.getSelectSeat().click();
		buspage.getclickBookSeat().click();
		
	}

}
