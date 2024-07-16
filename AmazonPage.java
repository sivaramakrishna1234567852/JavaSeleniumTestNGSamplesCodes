package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
	WebDriver driver;
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	WebElement books;
	public WebElement getBooksLink() {
		return books;
	}
	
	@FindBy(xpath="//option[contains(text(),'Books')]")
	WebElement dbooks;
	public WebElement getDbooksLink() {
		return dbooks;
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement textbox;
	public WebElement getTextBox() {
		return textbox;
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement search;
	public WebElement getSearchButton() {
		return search;
	}
	
	public AmazonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}



}
