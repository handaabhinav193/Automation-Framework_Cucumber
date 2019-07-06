package com.FaceBook.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	public Properties pro;
	
	public ReadConfigFile(){
		
		/*
		 * To define path of the configuration file
		 */
		File configFile = new File("/Users/handa/eclipse-workspace/Facebook/Utility_Folders/Configuration/config.properties");
		try {
			/*
			 * For Reading the configuration file
			 */
			FileInputStream read = new FileInputStream(configFile);
			/*
			 * Object creation of Properties Class for accessing the parameter from config file
			 */
			pro = new Properties();
			/*
			 * reading config file
			 */
			pro.load(read);
			
		}catch(Exception e) {
			System.out.println("Error Message for Configuration file" +e.getMessage());
		}
	}
	/*
	 ******Reading Browser for Test, Application Url, Username & Password**************
	 */
	public String getBrower() {
		return pro.getProperty("Browser");
	}
	public String autUrl() {
		return pro.getProperty("qaUrl");
	}
	public String uName() {
		return pro.getProperty("UserName");
	}
	public String uPass() {
		return pro.getProperty("Password");
	}
}
