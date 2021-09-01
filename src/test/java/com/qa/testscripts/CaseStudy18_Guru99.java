package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Guru99Pages;

public class CaseStudy18_Guru99 extends TestBase {
	
	/*Case Study 18:

	Goto Newtours --> http://newtours.demoaut.com/
	Enter Login Credential of Username & Password as "mercury"
	Click on Signin Button
	Check if  'India' is present or not in the Departing from list box.
	*/
        @Test
		@Parameters("url")
		public void newtours18(String url) throws InterruptedException {
			int count = 0;
			Guru99Pages newtours = new Guru99Pages(driver);

			driver.get(url);

			// Check if 'India' is present or not in the Departing from list box.

			newtours.getFlight().click();

			List<WebElement> items = newtours.getDeparture().getOptions();
			for (WebElement present : items) {
				String dropdownOptionValue = present.getText();
				if (dropdownOptionValue.equals("India")) {
					System.out.println("India is present in the dropdown list");
					count++;
					Thread.sleep(100);
					break;
				}
			}
			if (count == 0)
				System.out.println("India is not present in the dropdown list");
			    Reporter.log("India is not present in the dropdown list");

		}
	}


