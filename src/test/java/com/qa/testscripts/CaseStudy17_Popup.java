package com.qa.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CaseStudy17_Popup  extends TestBase{
	

	/*Case Study 17:

	1.	Launch the URL --> Popup3.html
	2.	Click on “Click on me” Button.
	3.	Enter the text in the Text box
	4.	Click OK Button.
	5.	Get the confirmation message & print in console.*/
        @Test
		@Parameters("url")
		public void pop3(String url) throws InterruptedException {
		
		       //Launch the URL --> popup2.html
				driver.get(url);
				
				//Click on “Click on me” Button.
				WebElement btn=driver.findElement(By.xpath("/html/body/button"));
				btn.click();
				
				//Enter the text in the Text box
				Alert alert=driver.switchTo().alert();
				alert.sendKeys("Harry poter");
				Thread.sleep(3000);
				alert.accept();
				
				//Get the confirmation message & print in console.

			}

	}

	
	


