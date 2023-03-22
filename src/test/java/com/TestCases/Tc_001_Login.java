 package com.TestCases;

import java.io.IOException;

//import org.openqa.selenium.WebElement;
///import org.slf4j.Logger;
//import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.LoginPage;
import com.Utilities.ReadFromExcel;

public class Tc_001_Login extends BaseClass {
	
	@Test
	public void Login_Test() {
		
		driver.get(BaseUrl);
	     logger.info("url opened");
		LoginPage lp=new LoginPage(driver);
		lp.setfname(uname);
		System.out.println("uname provided");
		logger.info("added first name");
		lp.setlname(password);
		System.out.println("password provided");
		logger.info("added last name");
		
		
		
		///lp.ClickSignIn();
		
//		
//		WebElement lnktxt=driver.findElement(By.linkText("Contacts"));
//		String txt=lnktxt.getText();
////		
//		if(txt.equals("Contacts")) {
//			Assert.assertTrue(true);
//		}else {
//			Assert.assertTrue(false); 
//		}
		
//		String title=driver.getTitle();
//		System.out.println(title);
//		
			
		
	}
	
	
	public void getData() throws IOException {
		
		String path="sheetxl.xlsx";
		
		int rownum=ReadFromExcel.GetRowCount(path, "Sheet1");
		
		  int colcount=ReadFromExcel.GetCellCount(path, "Sheet1", rownum);
		  
		        String[][] loginData=new String [rownum][colcount];
		        
		        for(int i=1;i<=rownum;i++) {
		        	
		       for(int j=0;j<colcount;j++) {
		    	   
		    	  /// String [i-1][j] loginData= ReadFromExcel.GetCellData(path, "Sheet1", i, j);
		    	   
		       }
		        	
		        }
		
		
		
	}
	

}
