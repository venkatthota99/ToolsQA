package com.tools.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tools.qa.base.TestBase;

public class Elementstab extends TestBase {
	
	   @FindBy(xpath="//*[text()='Text Box']")
	   WebElement textbox;
	   @FindBy(xpath="//*[@id='userName']")
	   WebElement username;
	   @FindBy(xpath="//*[@id='userEmail']")
	   WebElement useremail;
	   @FindBy(xpath="//*[@id='currentAddress']")
	   WebElement currentaddress;
	   @FindBy(xpath="//*[@id='permanentAddress']")
	   WebElement permanentAddress;
	   @FindBy(xpath="//*[@id='submit']")
	   WebElement submit;
	   @FindBy(xpath="//*[text()='Check Box']")
	   WebElement checkbox;
	   @FindBy(xpath="//*[@class = 'rct-checkbox']")
	   WebElement checkboxbutton;
	   @FindBy(xpath="//*[@id = 'result']")
	   WebElement checkboxresult;
	 	   
	   
	// Initialization
	
	public Elementstab() {
		PageFactory.initElements(driver, this);
	}
	
	public void filltextbox() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", textbox);
		//textbox.click();
		Thread.sleep(5000);
		username.sendKeys("Thota");
		useremail.sendKeys("vthota.ca@gmail.com");
		currentaddress.sendKeys(" apt 201 Saidarbar");
		permanentAddress.sendKeys("nellore");
		jse.executeScript("arguments[0].click();", submit);
		//submit.click();
			}
	
	public String checkbox() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", checkbox);
		checkboxbutton.click();
		Thread.sleep(5000);
		String Checkboxtext = checkboxresult.getText();
		return Checkboxtext;
		
	}

	
	
}
