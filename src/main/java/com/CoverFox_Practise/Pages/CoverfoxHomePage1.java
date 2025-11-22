package com.CoverFox_Practise.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHomePage1 {
	//variablles-WebElements
		@FindBy(xpath = "//div[text()='Female']") private WebElement FemaleButton;
		
		
		//constructor
		public CoverfoxHomePage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//methods-public 
		//POM classes strictly follows encapsulation
		public void clickOnFemaleButton()
		{
			FemaleButton.click();
			System.out.println("Clicking on FemaleButton on HomePage");
		}


}
