package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPages {
		WebDriver driver;
		 
		 @FindBy(linkText=("register"))
	     WebElement register;
		 
		 @FindBy(id=("firstname"))
	     WebElement firstname;
		
		 @FindBy(id=("lastname"))
	     WebElement lastname;
		 
		 @FindBy(id=("Email"))
	     WebElement Email;
		 
		 @FindBy(id=("password"))
	     WebElement password;
		 
		 @FindBy(id=("showpassword"))
	     WebElement showpassword;
		 
		 
		 
		 public WebElement getRegister() {
			return register;
		}

		public WebElement getFirstname() {
			return firstname;
		}


		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getEmail() {
			return Email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getShowpassword() {
			return showpassword;
		}

		public EbayPages(WebDriver driver) {
				this.driver=driver;
		    	PageFactory.initElements(driver, this);
		    	  
		      }

		
	}



