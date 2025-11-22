package com.CoverFox_Practise.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHealthPlanPage1 {
	//variables-WebElements
		@FindBy(xpath="//div[text()=' Next ']") private WebElement nextButton;
		
		//constructor
		public CoverfoxHealthPlanPage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//method
		public void clickOnNextButton()
		{
			nextButton.click();
			System.out.println("Clicking on next button on health plan page");
		}


}
