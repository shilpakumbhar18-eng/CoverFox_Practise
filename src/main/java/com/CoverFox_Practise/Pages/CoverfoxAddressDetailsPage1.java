package com.CoverFox_Practise.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CoverfoxAddressDetailsPage1 {

	// variables
			@FindBy(xpath="(//input[@type='number'])[1]")private WebElement zipCodeField;
	        @FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNoField;
	        @FindBy(xpath="//div[text()='Continue']")private WebElement continueButton;
		
	       //constructor
	        public  CoverfoxAddressDetailsPage1(WebDriver driver)
	        {
	        	PageFactory.initElements(driver, this);
	        }
	        
	        //methods
	        public void enterZipCodeField(String zipcode) throws EncryptedDocumentException, IOException
	        {
	        	zipCodeField.sendKeys(zipcode);
	        	System.out.println("entering pincode value "+zipcode);
	        }
	        public void enterMobNoField(String mobNo) throws EncryptedDocumentException, IOException
	        {
	        	mobNoField.sendKeys(mobNo);
	        	System.out.println("entering mobile no value  "+ mobNo );
	        }
	        public void clickOnContinueButton()
	        {
	        	continueButton.click();
	        	System.out.println("Clicking on continue button");
	        }
	        
	        
	        
	}


