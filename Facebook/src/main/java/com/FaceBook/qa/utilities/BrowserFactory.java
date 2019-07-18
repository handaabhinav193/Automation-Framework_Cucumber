package com.FaceBook.qa.utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver startBrowser(WebDriver driver, String Browser, String applicationURL) { //Passing driver, browser for test & application URL
	if(Browser.equals("Chrome")) {
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\handa\\git\\Automation-Framework_Cucumber\\Facebook\\Utility_Folders\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(ops);
		
	}else if(Browser.equals("Firefox")) {
		System.setProperty("webdriver.chrome.driver", "//Users//handa//eclipse-workspace//Facebook//Utility_Folders//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		
	}else if(Browser.equals("IE")) {
		System.setProperty("webdriver.chrome.driver", "//Users//handa//eclipse-workspace//Facebook//Utility_Folders//Drivers//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
	else {
		System.out.println("We do not support this browser");
				}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(applicationURL);
		
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
}