package com.CoverFox_Practise.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CoverFox_Practise.Utils.Utility;



public class CoverfoxMemberDetailsPage1 {

	
		 //variables
		@FindBy(id="Age-You")private WebElement ageDropDown;
		@FindBy(xpath="//div[text()='Next']")private WebElement nextButton;
		
		//constructor
		public CoverfoxMemberDetailsPage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//methods
		public void clickOnAgeDropDown(String age) throws EncryptedDocumentException, IOException
		{
			ageDropDown.click();
			Utility.handleDropDownUsingVisibleText(ageDropDown," "+age+" years ");
		}
		public void clickOnNextButton()
		{
			nextButton.click();
			System.out.println("Clicking next button on Member details page");
		}

	

}
