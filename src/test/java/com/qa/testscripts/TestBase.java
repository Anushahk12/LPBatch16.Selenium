package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	          WebDriver driver;
			@BeforeClass
			public void setUp( )
			{
				System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			}
			
			@AfterClass
			public void tearDown() {
				//close browser
				driver.close();
			}
			

		}






