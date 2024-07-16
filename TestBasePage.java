package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class TestBasePage {
	  WebDriver driver;
	  @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/div[1]/div[2]/span[2]")
	  WebElement clickEmailrMobile;
	  public WebElement ClickEmailorMobile() {
		 
		  return clickEmailrMobile;
	  }
	  
	  @FindBy(id="username")
	  WebElement userName;
	  public WebElement EnterMobileNo() {
		 return userName; 
	  }
	  
	  @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")
	  WebElement ContinueButton;
	  public WebElement getContinueButton() {
		  return ContinueButton;
	  }
	  
	  @FindBy(xpath="//span[contains(text(),'Login')]")
	  WebElement loginButton;
	  public WebElement getLoginButton() {
		  return loginButton;
	  }
	
	  
	   @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
	   WebElement hotelMenu;
	   
	   public WebElement getHotelmenu() {
		   return hotelMenu;
	   }
	    @FindBy(xpath="//a[contains(text(),'or Login via Password')]")
	    WebElement viapassword;
	    public WebElement getViaPasswordlink() {
	    	return viapassword;
	    }
	    @FindBy(id="password")
	    WebElement passwordenter;
     public WebElement getPasswordBox() {
  	   return passwordenter;
     }
      
	  
     @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")
     WebElement login;
     public WebElement getLoginbutton() {
  	   return login;
     }
     @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
     WebElement hotelmenu;
     public WebElement getHotelMenu() {
  	   return hotelmenu;
     }

     
	  public  TestBasePage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
}
