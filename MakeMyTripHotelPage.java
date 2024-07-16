package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripHotelPage {
	WebDriver driver;
	@FindBy(id="city")
	WebElement city;
	public WebElement getClickEnterCity() {
		return city;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement CityNameEnterField;
	public WebElement getCityNameEnterField() {
		return CityNameEnterField;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]")
	WebElement clickcityFromSuggestion;
	public WebElement getclickcityFromSuggestion() {
		return clickcityFromSuggestion;
	}
	@FindBy(css="body.desktop.in.webp:nth-child(2) div.bgGradient.webpSupport div.page-section.sticky-scroll.topSection.appendBottom40 div.landingContainer div.headerOuter div.chHeaderWrapper.navOnly div.chHeaderContainer nav:nth-child(2) ul.makeFlex.font12 li.menu_Hotels > a.makeFlex.hrtlCenter.column")
	WebElement hotelmenu;

	public WebElement getClickHotelmenu() {
		return hotelmenu;
	}


	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[2]")
	WebElement clickcheckindate;
	public WebElement getclickCheckinDate() {
		return clickcheckindate;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[3]/div[2]")
	WebElement getcheckindate;
	public WebElement getCheckindate() {
		return getcheckindate;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[5]")
	WebElement getcheckout;
	public WebElement getCheckOutDate() {
		return getcheckout;
	}
	@FindBy(xpath="//input[@id='guest']")
	WebElement addGuestsRooms;
	public WebElement getAddGuestsRooms() {
		return addGuestsRooms;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]")
	WebElement addAdults;
	public WebElement getAdultsCount() {
		return addAdults;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[2]/li[2]")
	WebElement noofChildren;
	public WebElement getChildrenCount() {
		return noofChildren;
	}
	
	@FindBy(id="0")
	WebElement clickAddChildAge;
	public WebElement getClickAddChildAge() {
		return clickAddChildAge;
	}
	@FindBy(xpath="//button[contains(text(),'APPLY')]")
	WebElement apply;
	public WebElement getApplyBotton() {
		return apply;
	}

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]")
	WebElement travelfor;
	public WebElement getSelectTravellingReason() {
		return travelfor;
	}
	@FindBy(xpath="//li[contains(text(),'Work')]")
	WebElement reason;
	public WebElement getReason(){
		return reason;
	}
	@FindBy(id="hsw_search_button")
	WebElement searchbutton;
	public WebElement getHotelSearchButton() {
		return  searchbutton;
	}
	//@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]") or
	//@FindBy(xpath="//div[starts-with(@class,'priceDetails')]")//listingRowOuter hotelTileDt makeRelative
	//@FindBy(xpath="//div[starts-with(@class,'listingRowOuter hotelTileDt makeRelative')]")
	//@FindBy(className="tile__priceSection")
	//@FindBy(css="div.singleHeader div._Hlisting:nth-child(2) div.container.makeFlex.spaceBetween:nth-child(3) div.listingWrap div:nth-child(1) div.infinite-scroll-component div.listingRowOuter.hotelTileDt.makeRelative:nth-child(2) > a:nth-child(1)")
	@FindBy(id="hlistpg_hotel_cut_price")
	WebElement selecthotel;
	public WebElement getSelectHotel(){
		return  selecthotel;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/section[2]/div[4]/ul[1]/li[1]")
	WebElement clickbreakfast;
	public WebElement getBreakFast() {
		return clickbreakfast;
	}
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/section[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]")
	WebElement add1stroom;
	public WebElement get1stRoom() {
		return add1stroom;
	}
	@FindBy(css="div.singleHeader div.dtNewDetailsPage:nth-child(2) div.hotelDetailsPage__container div.prmDtl__bottom div.prmDtl__bottom--content section.page__section.appendBottom35:nth-child(2) div.rmSelectRooms:nth-child(4) div.rmSelectCont.appendBottom20 div.rmSelect__card div.rmSelect__card--wrap div.rmSelect__card--wrapRow:nth-child(1) div.rmSelect__card--right div.rmSelect__card--row:nth-child(2) div.rmSelect__card--rowRight div.rmPayable div.rmPayable__dtl div.rmPayable__dtl--right > a.primaryBtn.rmPayable__dtl--cta")
	WebElement selectroom;
	public WebElement getClickSelectRoom() {
		return selectroom;
	}
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	WebElement hotelcity;
	public WebElement getHotelCity() {
		return  hotelcity;
	}
	@FindBy(id="detpg_hotel_rooms")
	WebElement gotorooms;
	public WebElement getCLickGoToRooms() {
		return gotorooms;
	}
	
	//@FindBy(xpath="//a[starts-with(@class,'primaryBtn ')]")////a[contains(text(),'BOOK THIS NOW')]
	//@FindBy(xpath="//a[contains(text(),'BOOK THIS NOW')]")
	@FindBy(css="div.singleHeader div.dtNewDetailsPage:nth-child(2) div.hotelDetailsPage__container div.baseHeaderContiner div.baseRight div.baseRight__sticky div.prmRoomDtlCard.appendBottom10 div.prmRoomDtlCard__footer span.bookNowBtn > a.primaryBtn")
	//@FindBy(css="a[class='primaryBtn']")
	//@FindBy(id="detpg_headerright_book_now")
	WebElement bookthisnow;

	public WebElement getBookThisNowButton() {
		return bookthisnow;
	}
	//@FindBy(xpath="//label[contains(text(),'Myself')]")
	//@FindBy(id="myself")
	//@FindBy(xpath="//input[@id='myself']")
	//@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]")
	@FindBy(css="div.singleHeader div.rvwNew div.reviewContainer div.reviewContainer__left div.guestDtls.appendBottom20 div.guestDtls__content form:nth-child(1) div.makeFlex.appendBottom30:nth-child(2) div.appendRight20:nth-child(1) span.radioOuter > label.font14.latoBold:nth-child(2)")
	WebElement bookthisfor;
	public WebElement getBookingForRadioBtn() {
		return bookthisfor;
	}
	@FindBy(xpath="//input[@id='fName']")
	WebElement enterFirstName;
	public WebElement getEnterFirstNameField() {
	  return enterFirstName;
	}
	@FindBy(xpath="//input[@id='lName']")
	WebElement enterLastName;
	public WebElement getEnterLastNameField() {
	  return enterLastName;
	}
	@FindBy(xpath="//button[contains(text(),'ADD')]")
	WebElement addTripInsurance;
	public WebElement getAddTripInsuranceBtn() {
		return addTripInsurance;
	}
	@FindBy(xpath="//a[contains(text(),'Pay Now')]")
	WebElement clickPayNow;
	public WebElement getClickPayNowBtn() {
		return clickPayNow;
	}
	public MakeMyTripHotelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	















}