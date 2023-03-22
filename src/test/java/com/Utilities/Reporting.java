//package com.Utilities;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;
//
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//public class Reporting extends TestListenerAdapter{
//
//	public ExtentHtmlReporter htmlreporter;
//	//public ExtentReports extent;
//	//public ExtentTest logger;
//	
//	
//	public void onTestStart(ITestResult tr) {
//		
//		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//        String repname="test-report."+timeStamp+".html";
//
//        htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output"+repname);
//        
//        ///htmlreporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
//		
//	System.out.println("test started");	
//	}
//	
//	
//    public void onTestSuccess(ITestResult tr) {
//		System.out.println("test successful");
//	}
//    
//     public void onTestFailure(ITestResult tr) {
//		System.out.println("on test fail");
//	}
//     
//     public void onTestSkipped(ITestResult tr) {
// 		System.out.println("on test skip");
// 	}
// 	
//	
//}
