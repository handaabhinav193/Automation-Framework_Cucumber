package com.FaceBook.qa.steps;

import org.openqa.selenium.WebDriver;

import com.FaceBook.qa.page.LoginPage;
import com.FaceBook.qa.utilities.BrowserFactory;
import com.FaceBook.qa.utilities.ReadConfigFile;

public class BaseClass {
	
	public static WebDriver driver;
	public LoginPage loginpage;
	public ReadConfigFile configFile = new ReadConfigFile();
	
	public String user = configFile.uName();
	public String pass = configFile.uPass();
	
	public void setup() {
		driver = BrowserFactory.startBrowser(driver,configFile.getBrower(),configFile.autUrl());
	}
	
	public void tearDown(){
		BrowserFactory.closeBrowser(driver);
	}
}
