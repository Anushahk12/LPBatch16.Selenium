package com.qa.testscripts;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Google_ExtentReport {
		
		private static WebDriver driver = null;
		
		
		
		public static void main(String[] args)  {
			ExtentReports extent = new ExtentReports();
			ExtentSparkReporter avent = new ExtentSparkReporter("ExtentReport.html");
			extent.attachReporter(avent);
			ExtentTest test1 = extent.createTest("Google search","This test is to validate google search functionality");
			String projectPath = System.getProperty("user.div");
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			test1.log(Status.INFO, "Starting Test Case");
			
			driver.get("https://google.com");
			test1.pass("Navigated to google.com");
			
			driver.findElement(By.name("q")).sendKeys("Automation Testing");
			test1.pass("Entered Text In Search Box");
			
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			test1.pass("Pressed Enter Key");
			
			driver.close();
			driver.quit();
			test1.pass("Closed The Browser");
			
			test1.info("Test Completed");

	        extent.flush();
	        
	     
		}
		

		
	
	}



