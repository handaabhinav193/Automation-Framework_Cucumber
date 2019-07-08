package com.FaceBook.qa.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.FaceBook.qa.utilities.*;

public class BaseClass {
	
	public WebDriver driver;
	public ReadConfigFile config;
	public BrowserFactory bfactory;
	
	@BeforeClass
	public void appLauncher() {
		bfactory = new BrowserFactory();
		config = new ReadConfigFile();
		bfactory.startBrowser(driver, config.getBrower(), config.autUrl());
	}
	
	@AfterClass
	public void appWrapUp(){
		bfactory = new BrowserFactory();
		bfactory.closeBrowser(driver);
	}

}
