package com.qa.testscripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CaseStudy16_Popup extends TestBase {
	
	

	
	/*Case Study 16:

	1.	Launch the URL --> popup2.html
	2.	Click on “Click on me” Button.
	3.	Get Text on the pop up window
	4.	Accept / Dismiss pop up
	5.	Get the confirmation message based on accept / dismiss 
	6.	Verify whether it is an accept / dismiss alert, based on the confirmation message & print in console. 
	*/



		     @Test
		     @Parameters("url")
		     public void pop2(String url) throws InterruptedException {
		        //Launch the URL --> popup2.html
				driver.get(url);
				
				//Get Text on the pop up window
				
				Alert alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				
				//Accept / Dismiss pop up
				Thread.sleep(3000);
				alert.accept();
				
				//Get the confirmation message based on accept / dismiss
				
				
				/*Verify whether it is an accept / dismiss alert, based on the
				 confirmation message & print in console.*/ 
				
			}

	}



