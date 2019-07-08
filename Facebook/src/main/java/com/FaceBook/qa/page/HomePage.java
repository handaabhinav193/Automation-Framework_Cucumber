package com.FaceBook.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//div[text()='Abhinav Handa']")
	public WebElement homeTagAbhinav;
	
	public boolean homePageAbhinav() {
		return homeTagAbhinav.isDisplayed();
	}

}
