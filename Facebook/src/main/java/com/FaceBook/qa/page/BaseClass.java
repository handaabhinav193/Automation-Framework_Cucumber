package com.FaceBook.qa.page;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.FaceBook.qa.utilities.BrowserFactory;
import com.FaceBook.qa.utilities.ReadConfigFile;

public class BaseClass {
	
	public static WebDriver driver;
	public ReadConfigFile configFile;
	
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
