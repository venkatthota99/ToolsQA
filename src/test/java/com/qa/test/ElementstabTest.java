package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tools.qa.base.TestBase;
import com.tools.qa.pages.Elementstab;
import com.tools.qa.pages.MainPage;

public class ElementstabTest extends TestBase{
	
	MainPage	mainpage;	
	Elementstab  elementstab;
	

	public ElementstabTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setup() throws InterruptedException {
		initialization();
		mainpage = new MainPage();
		elementstab = mainpage.Elements();
		//elementstabtextbox = new ElementstabtextboxTest();				
		
	}
	
	/*
	 * @Test (priority=1)
	 * 
	 * public void filltextboxTest() throws InterruptedException {
	 * elementstab.filltextbox();
	 * 
	 * }
	 */
	
@Test (priority=2)
	
	public void checkboxTest() throws InterruptedException {				
		String checkboxtext = elementstab.checkbox();
		Assert.assertEquals(checkboxtext, "You have selected :\r\n" + 
				"home\r\n" + 
				"desktop\r\n" + 
				"notes\r\n" + 
				"commands\r\n" + 
				"documents\r\n" + 
				"workspace\r\n" + 
				"react\r\n" + 
				"angular\r\n" + 
				"veu\r\n" + 
				"office\r\n" + 
				"public\r\n" + 
				"private\r\n" + 
				"classified\r\n" + 
				"general\r\n" + 
				"downloads\r\n" + 
				"wordFile\r\n" + 
				"excelFile");
		
	}
	
	@AfterMethod	
	public void teardown() {
		driver.quit();
	}
		
}
