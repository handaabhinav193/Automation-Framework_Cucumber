package com.FaceBook.qa.steps;

import org.openqa.selenium.WebDriver;
import com.FaceBook.qa.utilities.BrowserFactory;
import com.FaceBook.qa.utilities.ReadConfigFile;

public class BaseClass {
	
	public WebDriver driver;
	public ReadConfigFile configFile = new ReadConfigFile();
	
	public void setup() {
		driver = BrowserFactory.startBrowser(driver,configFile.getBrower(),configFile.autUrl());
	}
	
	public void tearDown(){
		BrowserFactory.closeBrowser(driver);
	}
}
