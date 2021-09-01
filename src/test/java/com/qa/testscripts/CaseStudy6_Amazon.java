package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class CaseStudy6_Amazon extends TestBase {
	

	
	
		/*Case Study 6:
		1. Goto Amazon.in
		2. Select <category>
		2. Search for the <item name>
		3. Click search button
		4. Print all the collection of items that are loaded 
		5. Get the Title & price of all the items and log the results


		Books, Da vinci code
		Electronics,Mobile phones
		Furniture, Wooden tables*/

	
		
		 @Test
		 @Parameters("url")
		 public void amazon(String url) {
			 AmazonPages amazon = new AmazonPages(driver);
			 
			//1. Goto Amazon.in
			 
			driver.get(url);
			
			//2.Select <category>, Books
			amazon.getCategory().selectByVisibleText("Books");
			
			//2.Search for the <item name>, Da vinci code
			amazon.getSearchtextbox().sendKeys("Da vinci code");
			
			//3.Click search button
			amazon.getMaginifierBtn().click();
			
			//4.Print all the collection of items that are loaded
			List<WebElement> item = amazon.getSelectedItems();
			for(WebElement we : item ) {
				System.out.println(we.getText());
				System.out.println("****************************************");
			}
			
			//5.Get the Title & price of all the items and log the results
			List<WebElement> title = amazon.getTitle();
			List<WebElement> price = amazon.getPrice();
			for(WebElement we : title ) {
				System.out.println(we.getText());
			}
			System.out.println("****************************************");
			for(WebElement we : price) {
				System.out.println(we.getText());
			}
		
	}
	}

	


	