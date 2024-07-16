package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripBusPage {
	WebDriver driver;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]")
	WebElement selectBusMenu;
	public WebElement getSelectBusMenu() {
		return selectBusMenu;
	} 
	@FindBy(id="fromCity")
	WebElement clickfromCity;
	public WebElement getclickFromCity() {
		return clickfromCity;
	} 
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement fromCity;
	public WebElement getFromCity() {
		return fromCity;
	}
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	WebElement clickcityfromsuggestion;
	public WebElement getClickCityFromSuggestion() 
	{
		return clickcityfromsuggestion;
	}
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	WebElement clicktoCity;
	public WebElement getClickToCity() {
		return clicktoCity;
	}
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement toCity;
	public WebElement getToCity() {
		return toCity;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[5]/div[5]")
	WebElement clicktraveldate;
	public WebElement getClickTravelDate() {
		return clicktraveldate;
	}
	@FindBy(xpath="//button[@id='search_button']")
	WebElement clickSearchButton;
	public WebElement getClickSearchButton() {
		return clickSearchButton;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[2]/div[10]/div[1]/div[2]/a[1]")
	WebElement clickSelectSeats;
	public WebElement getClickSelectSeats() {
		return clickSelectSeats;
	}
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[2]/div[11]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/span[1]")
	WebElement selectDropPoint;
	public WebElement getDropPoint() {
		return selectDropPoint;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")
	WebElement selectPickUpPoint;
	public WebElement getPickUpPoint() {
		return selectPickUpPoint;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[2]/div[10]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[18]/img[1]")
	WebElement selectSeat;
	public WebElement getSelectSeat() {
		return selectSeat;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[2]/div[10]/div[2]/div[1]/div[1]/div[2]/div[6]")
	WebElement clickBookSeat;
	public WebElement getclickBookSeat() {
		return clickBookSeat;
	}
	public MakeMyTripBusPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
