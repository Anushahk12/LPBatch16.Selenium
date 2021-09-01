package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Guru99Pages;

public class CaseStudy8_Guru99  extends TestBase{
	

	/*Case Study 8:

	Goto Newtours application
	Login with Credentials
	Verify the default values selected in the Departing from is not same as Arriving In select box*/

	      
		 @Test
		 @Parameters("url")
		 public void newtours(String url) {
			 Guru99Pages newtours = new Guru99Pages(driver);
			 
			//Goto Newtours --> http://demo.guru99.com/test/newtours//
			driver.get(url);
			
			//Verify the default values selected in the Departing from is not same 
			//as Arriving In select box
			
			newtours.getFlight().click();
			String fromDeparture = newtours.getDeparture().getFirstSelectedOption().getText();
			String fromMonth = newtours.getMonth().getFirstSelectedOption().getText();
			String fromDay = newtours.getDay().getFirstSelectedOption().getText();
			
			String toLoc = newtours.getToLoc().getFirstSelectedOption().getText();
			String toMonth = newtours.getToMon().getFirstSelectedOption().getText();
			String toDay = newtours.getToDay().getFirstSelectedOption().getText();
			
			if(fromDeparture.equals(toLoc) && fromMonth.equals(toMonth) && fromDay.equals(toDay))
				System.out.println("default values selected in the Departing from is same as Arriving In select box");
			else
				System.out.println("default values selected in the Departing from is not same as Arriving In select box");
	}
	}

	


