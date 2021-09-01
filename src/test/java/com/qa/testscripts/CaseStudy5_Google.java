package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.GooglePages;

public class CaseStudy5_Google extends TestBase {
	
	
	/*Case Study 5: The following case study is to demonstrate on how to retrieve the 
		values from Auto suggest fields.

		1. Open Browser
		2. Launch google url
		3. Search for "Automation Testing"
		4. Fetch all the items loaded in the auto suggest field and print
		5. Click on Search button
		6. Get the title should be same as search term*/

		@Test
		@Parameters("url")
		public void google(String url) throws InterruptedException {
			GooglePages page = new GooglePages(driver);
			// Launch the google URL
			driver.get(url);

			// Search for "Automation Testing"

			page.getSearchbox().sendKeys("Automation Testing");

			// Fetch all the items loaded in the auto suggest field and print
			
			Thread.sleep(5000);
			List<WebElement> searchItem = page.getSuggestedNames();
			for (WebElement l : searchItem) {
				System.out.println(l.getText());
				Reporter.log(l.getText());
				
			}

			// Click on Search button
			page.getMaginifier().submit();

			// Get the title should be same as search term

			if (driver.getTitle().contains("Automation Testing"))
				Reporter.log("search item and title Both are equal ", true);
			else
				Reporter.log("search item and title Both are nor equal ", true);

		}

	}


