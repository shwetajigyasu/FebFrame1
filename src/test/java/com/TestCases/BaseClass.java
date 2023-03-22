package com.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig RC=new ReadConfig();
	 
	 
	 
	public String BaseUrl=RC.getAppUrl();
	public String uname=RC.getuname();
	public String password="Evs@12345";
	public  WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void presetup(String br) {
		
	          logger=Logger.getLogger("FebFramework");
		                
			PropertyConfigurator.configure("log4j.properties"); 
					
			if(br.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",RC.getchromepath() );
                driver=new ChromeDriver();
			}else if(br.equals("Internet Explorer")){
				System.setProperty("webdriver.chrome.driver",RC.getchromepath() );
                driver=new ChromeDriver();
			}
		                
	}
	
	
	@AfterClass
	public void tear() {
		driver.quit();
	}
	
	public String getscreenshot(String TestCaseName) throws IOException  {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		       File source=ts.getScreenshotAs(OutputType.FILE);
		       
		       String destpath=System.getProperty("user.dir")+"//reprts//"+TestCaseName+".png";
		        
		       File file=new File(destpath);
		       
		       ///FileUtils.getFile(source, destpath);
		       FileUtils.copyFile(source, file);
		       
		     
		       return destpath;
	}

	
	
}
