package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class TestBase {
	WebDriver driver = null;
	//String Browser = "Chrome";
	@Parameters({"Browser","url"})
	@BeforeClass
	public void setUp(String Browser,String url) {
	
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\Downloads\\percy pics\\chromedriver_win32\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); // invoke the browser
		}
		else if(Browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Siva\\Downloads\\percy pics\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
			//WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver(); // invoke the IE
		}
		else if (Browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\percy pics\\edgedriver_win64\\msedgedriver.exe");
			//WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
		   System.setProperty("webdriver.firefox.driver","C:\\Users\\Siva\\Downloads\\percy pics\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			//WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
	driver.get(url);
	driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
