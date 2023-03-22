 package com.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Ext {
	
	static ExtentReports extent;
	
	public static ExtentReports config() {
		
		String path =System.getProperty("user.dir")+"\\reprts\\index.html";
		ExtentSparkReporter exreport=new ExtentSparkReporter(path);
		exreport.config().setReportName("Automation Result");
		exreport.config().setDocumentTitle("Test Results");
		
		
		 extent=new ExtentReports();
		extent.attachReporter(exreport);
		extent.setSystemInfo("creater", "shweta");
		return extent;
		
	}
	
	
	public void start() {
		
	}

	
}
