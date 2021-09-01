package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {
	
	WebDriver driver;
	
	@FindBy(id="searchDropdownBox")
	WebElement Category;
	public  Select getCategory() {
		Select cat=new Select(Category);
		return cat;
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtextbox;
	public WebElement getSearchtextbox() {
		return searchtextbox;
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement MaginifierBtn;
    public WebElement getMaginifierBtn() {
    	return MaginifierBtn;
    	
    }
    
    @FindBy(xpath = "//div[@data-component-type='s-search-result']")
	List<WebElement> selectedItems;
	
	public List<WebElement> getSelectedItems() {
		return selectedItems; 
	}

    
    @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
    List<WebElement> title;
    
    public List<WebElement> getTitle() {
    	return title;
    }
    
    @FindBy(xpath = "//span[@class='a-price-whole']")
	List<WebElement> price;

	public List<WebElement> getPrice() {
		return price;
	}
    
    public AmazonPages(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }

	public void setCategoryList(String category2) {
		// TODO Auto-generated method stub
		
	}

}