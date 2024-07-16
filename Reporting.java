package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
     
	  public ExtentHtmlReporter htmlReporter;
	  public ExtentReports xReports;
	  public ExtentTest xTest;
	  
	 
	  public void onStart(ITestContext testContext) {
		  String DateStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		  String repName="TestAutomation_Report"+DateStamp+".html";
		  htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
		  htmlReporter.config().setDocumentTitle("Automation Report");
		  htmlReporter.config().setReportName("Functional Test Report");
		  htmlReporter.config().setTheme(Theme.DARK);
		  htmlReporter.config().setAutoCreateRelativePathMedia(true);
		  xReports =new ExtentReports();
		  xReports.attachReporter(htmlReporter);
		  
	  }

	  
	  public void onFinish(ITestContext testContext) {
		  xReports.flush();
	  }
	 
	  public void onTestSuccess(ITestResult tr) {
	   xTest=xReports.createTest(tr.getName());
	   xTest.log(Status.PASS, "Test is Passed");
	   xTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	  }

	 
	  public void onTestFailure(ITestResult tr) {
		   xTest=xReports.createTest(tr.getName());
		   xTest.log(Status.FAIL, "Test is Failed");
		   xTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		   xTest.log(Status.FAIL,tr.getThrowable());
		   String SSpath= System.getProperty("user.dir")+"/Screensots/"+tr.getName()+".png";
		   File file=new File(SSpath);
		   if(file.exists()) {
			   try {
				xTest.fail("Screenshot for failed test is:"+xTest.addScreenCaptureFromPath(SSpath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		   }
		   
	  }

	  
	  public void onTestSkipped(ITestResult tr) {
		   xTest=xReports.createTest(tr.getName());
		   xTest.log(Status.SKIP, "Test is Skipped");
		   xTest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.AMBER));
	  }

	  
}
