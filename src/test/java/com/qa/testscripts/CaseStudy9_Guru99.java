package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Guru99Pages;

public class CaseStudy9_Guru99 extends TestBase {


	/*Case Study 9:

	Goto Newtours application
	Verify the Height & Width of Username & Password text box is same.*/


		 @Test
		 @Parameters("url")
		 public void newtours(String url) {
			 Guru99Pages newtours1 = new Guru99Pages(driver);
			 
			//Goto Newtours application --> http://demo.guru99.com/test/newtours//
			 
			driver.get(url);
			
			//Verify the Height & Width of Username & Password text box is same.
			
			int un_height = newtours1.getUsername().getSize().getHeight();
			int un_width = newtours1.getUsername().getSize().getWidth();
			
			int pwd_height = newtours1.getPassword().getSize().getHeight();
			int pwd_width = newtours1.getPassword().getSize().getWidth();
			
			if(un_height == pwd_height && un_width == pwd_width)
			System.out.println("Height & Width of Username & Password text box are same");
			else
				System.out.println("Height & Width of Username & Password text box are not same");
			
	 
	}
	}

	
	
	