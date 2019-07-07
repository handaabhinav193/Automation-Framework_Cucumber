package com.FaceBook.qa.page;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.FaceBook.qa.utilities.BrowserFactory;
import com.FaceBook.qa.utilities.ReadConfigFile;

public class BaseClass {
	
	public WebDriver driver;
	public ReadConfigFile config;
	
	@BeforeSuite
	public void initialSetUp() {
		config = new ReadConfigFile();
	}
	
	@BeforeClass
	public void appLauncher() {
		driver = BrowserFactory.startBrowser(driver, config.getBrower(), config.autUrl());
	}
	
	@AfterClass
	public void appWrapUp(){
		BrowserFactory.closeBrowser(driver);
	}

}
