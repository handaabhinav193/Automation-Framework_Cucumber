package com.FaceBook.qa.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static void startBrowser(WebDriver driver, String Browser, String applicationURL) {
		
	if(Browser.equals("Chrome")) {
		
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "//Users//handa//eclipse-workspace//Facebook//Utility_Folders//Drivers//chromedriver.exe");
		driver = new ChromeDriver(ops);
		
	}
	else if(Browser.equals("Firefox")) {
		System.setProperty("webdriver.chrome.driver", "//Users//handa//eclipse-workspace//Facebook//Utility_Folders//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(Browser.equals("IE")) {
		System.setProperty("webdriver.chrome.driver", "//Users//handa//eclipse-workspace//Facebook//Utility_Folders//Drivers//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(applicationURL);
	//return driver;
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
}