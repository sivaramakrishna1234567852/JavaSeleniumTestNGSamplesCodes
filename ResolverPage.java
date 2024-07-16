package com.resolver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResolverPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Test 5']")
	WebElement test5_heading;
	public WebElement Test5_heading() {
		return test5_heading;
	}
	
	@FindBy(id="nav-hamburger-menu")
	WebElement nav_menu;
	public WebElement menuBar() {
		return nav_menu;
	}
	
	@FindBy(xpath="//div[text()='Mobiles, Computers']")
	WebElement mobile_computers_menu;
	public WebElement mobileComputersMenu() {
		return mobile_computers_menu;
	}
    
	@FindBy(xpath="//a[contains(@href,'all_mobiles')]")
	WebElement all_mobiles_option;
	public WebElement allMobilesOption() {
		return all_mobiles_option;
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_box;
	public WebElement getSearchBox() {
		return search_box;
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement search_submit_btn;
	public WebElement getSearchSubmitBtn() {
		return search_submit_btn;
	}
	
	@FindBy(xpath="(//span[@data-component-type=\"s-product-image\"])[1]")
	WebElement first_search_result;
	public WebElement getFirstSearchResult() {
		return first_search_result;
	}
	
	// 1st specification locators
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[1]/td[1]")
	WebElement first_specification_name;
	public WebElement getFirstSpecificationName() {
		return first_specification_name;
	}
	
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[1]/td[2]")
	WebElement first_specification_value;
	public WebElement getFirstSpecificationValue() {
		return first_specification_value;
	}
	
	// 2nd specification locators
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[2]/td[1]")
	WebElement second_specification_name;
	public WebElement getSecondSpecificationName() {
		return second_specification_name;
	}
	
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[2]/td[2]")
	WebElement second_specification_value;
	public WebElement getSecondSpecificationValue() {
		return second_specification_value;
	}
	
	// 3rd specification locators
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[3]/td[1]")
	WebElement third_specification_name;
	public WebElement getThirdSpecificationName() {
		return third_specification_name;
	}
	
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[3]/td[2]")
	WebElement third_specification_value;
	public WebElement getThirdSpecificationValue() {
		return third_specification_value;
	}
	
	// 4th specification locators
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[4]/td[1]")
	WebElement four_specification_name;
	public WebElement getFourSpecificationName() {
		return four_specification_name;
	}
	
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[4]/td[2]")
	WebElement four_specification_value;
	public WebElement getFourSpecificationValue() {
		return four_specification_value;
	}
	
	// 4th specification locators
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[5]/td[1]")
	WebElement five_specification_name;
	public WebElement getFiveSpecificationName() {
		return five_specification_name;
	}
	
	@FindBy(xpath="//div[@id=\"productOverview_feature_div\"]/child::div/table/tbody/tr[5]/td[2]")
	WebElement five_specification_value;
	public WebElement getFiveSpecificationValue() {
		return five_specification_value;
	}
	
	
	public ResolverPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

}
