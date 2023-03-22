package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

    
public class ReadConfig {
	
	
	Properties pro;
	
	public ReadConfig(){
		
	File src=new File("./Configuration//config.properties");
	

    try {
	FileInputStream fis=new FileInputStream(src);
	    pro= new Properties();
	    pro.load(fis);
	
	
    }catch(Exception e){
   System.out.println("Exception is "+e.getMessage());	
   }	
 }
	
	public String getAppUrl() {
		String url=pro.getProperty("BaseUrl");
		return url;
	}
	
    public String getuname(){
    	String uname=pro.getProperty("uname");
    	return uname;
    }
    
    public String getchromepath() {
    	String chromepath=pro.getProperty("chromepath");
    	return chromepath;
    }

}
