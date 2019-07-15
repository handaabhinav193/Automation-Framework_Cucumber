package com.FaceBook.qa.page;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	
	public HomePage() {
		PageFactory.initElements(BaseClass.driver, HomePage.class);
	}
	
	public void homePageDisplayed() {
		
	}

}
