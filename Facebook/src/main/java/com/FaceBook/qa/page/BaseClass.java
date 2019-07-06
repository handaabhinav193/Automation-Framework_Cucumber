package com.FaceBook.qa.page;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.FaceBook.qa.utilities.BrowserFactory;
import com.FaceBook.qa.utilities.ReadConfigFile;

public class BaseClass {
	
	public WebDriver driver;
	public ReadConfigFile configFile;
	
	
	@BeforeSuite()
	public void initialSetUp() {
		configFile = new ReadConfigFile();
	}
	
	@BeforeClass()
	public void appLauncher() {
		driver = BrowserFactory.startBrowser(driver, configFile.getBrower(), configFile.autUrl());
	}
	
	@AfterClass()
	public void appWrapUp(){
		BrowserFactory.closeBrowser(driver);
	}

}
