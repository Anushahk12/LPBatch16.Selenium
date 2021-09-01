package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DestinationqaPages {
	
	     WebDriver driver;
	     
		 @FindBy(xpath=("//input[@value='Wed']"))
		 WebElement wedRadioBtn;
		 
		 @FindBy(xpath=("//input[@value='Mon']"))
		 WebElement monRadioBtn1;
		 
		 @FindBy(xpath=("//input[@name='red']"))
		 WebElement redradioBtn;
		 
		 @FindBy(xpath=("//input[@name='yellow']"))
		 WebElement yellowradioBtn;

		public WebElement getWedRadioBtn() {
			return wedRadioBtn;
		}

		public WebElement getMonRadioBtn1() {
			return monRadioBtn1;
		}

		public WebElement getRedradioBtn() {
			return redradioBtn;
		}

		public WebElement getYellowradioBtn() {
			return yellowradioBtn;
		}

		public DestinationqaPages(WebDriver driver) {
			this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	  
	      }
		 
	}



