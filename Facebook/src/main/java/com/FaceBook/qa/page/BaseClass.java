package com.FaceBook.qa.page;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.FaceBook.qa.utilities.*;

public class BaseClass {
	
	public static WebDriver driver;
	public ReadConfigFile configFile;
	public LoginPage loginPage;
	
	@BeforeClass
	public void startTestSession() {
		configFile = new ReadConfigFile();
		BrowserFactory.startBrowser(driver, configFile.getBrower(), configFile.autUrl());
	}
	
	@AfterClass
	public void endTestSession(){
		BrowserFactory.closeBrowser(driver);
	}
}
