package com.CoverFox_Practise.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxResultPage1 {
	//variables
		@FindBy(xpath="//div[contains(text(),' Health Insurance Plans')]") private WebElement matchingResults;
	   
		
		//constructor
		public CoverfoxResultPage1 (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//method
		public String getMatchingResultno()
		{
			String Results=matchingResults.getText();
			System.out.println("Fetching matching results");
		     String[] temp = Results.split(" ");
		     String finalResult=temp[0];
		     return finalResult;
		}

}
