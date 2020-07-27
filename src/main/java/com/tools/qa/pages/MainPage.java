package com.tools.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tools.qa.base.TestBase;



public class MainPage extends TestBase {
	
	@FindBy(xpath="//*[text()='Elements']")
	WebElement Elements;
	
	

	//Initializing
	
	public MainPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String gettitle() {
		String Title = driver.getTitle();
		return Title;
	}	
		
	public Elementstab Elements() throws InterruptedException   {
	  Thread.sleep(5000);
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy (0,400)");
	  Thread.sleep(5000);
	  jse.executeScript("arguments[0].click();", Elements);
	//  
	  return new Elementstab();
	  //Elements.submit();
	   	  
	}
	
	
	
	
}
