package com.Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TestCases.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends BaseClass implements ITestListener {

	ExtentReports Extent =Ext.config();
	 ExtentTest test;
	 
	private static ThreadLocal<ExtentTest> extenttest  =new ThreadLocal<ExtentTest>();
	 
	 public void onStart(ITestResult result) {
			
		    test=Extent.createTest(result.getMethod().getMethodName()); 
		    extenttest.set(test);
		
	}
	 
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		///ITestListener.super.onTestFailure(result);
		
		//test.fail(result.getThrowable());
		extenttest.get().fail(result.getThrowable());
		           
		
		try {
			extenttest.get().addScreenCaptureFromPath(getscreenshot(result.getMethod().getMethodName()), result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "successfull");
		
	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		////ITestListener.super.onTestSkipped(result);
	}

	

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		////ITestListener.super.onFinish(context);
	}

}
