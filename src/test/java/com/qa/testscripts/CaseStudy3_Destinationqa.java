package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.DestinationqaPages;

public class CaseStudy3_Destinationqa extends TestBase{


	/*Case Study 3: 
	The following case study is to demonstrate on how to perform user events on check box 
	and radio buttons.

	2. Launch url http://destinationqa.com/aut/RadioButtons.html
	3. Check if Wednesday radio button is selected by default under Radio button section
	4. Select Monday radio button
	5. Check if Red & Yellow Radio buttons are selected.
	   If yes, deselect Red and select Orange*/

	
		      @Test
		      @Parameters("url")
		      public void destinationQA(String url) {
		    	  DestinationqaPages dp = new DestinationqaPages(driver);	  
	          //2. Launch url http://destinationqa.com/aut/RadioButtons.html
		     
		    	  driver.get(url);
		      
		      //3.Check if Wednesday radio button is selected by default under Radio button section
		     
		      boolean selected = dp.getWedRadioBtn().isSelected();
		      System.out.println("Wednesday radio button is selected by default or not :"+selected);
		      
		      //4.Select Monday radio button
		      
		      dp.getMonRadioBtn1().click();
		      
		      //5.Check if Red & Yellow Radio buttons are selected.
		      
		      boolean selected1 = dp.getRedradioBtn().isSelected();
		      boolean selected2 = dp.getYellowradioBtn().isSelected();
		      System.out.println("Red radio button is selected or not :"+selected1);
		      System.out.println("Yellow radio button is selected or not :"+selected2);
		      
		      //6.If yes, deselect Red and select Orange
		      
		      if(selected1 == true && selected2 == true) {
		    	  dp.getRedradioBtn().click();
		    	  dp.getYellowradioBtn().click();
		      }
		      }
	}



