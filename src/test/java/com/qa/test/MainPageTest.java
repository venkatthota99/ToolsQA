package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tools.qa.base.TestBase;
import com.tools.qa.pages.MainPage;




public class MainPageTest extends TestBase{
	MainPage  mainpage;
	
	
	public MainPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		initialization();
		mainpage = new MainPage();
		
		}
				
	@Test (priority=1)
	public void MainpageTitleTest() throws InterruptedException {
	    mainpage.Elements();
	   String Title = mainpage.gettitle();
	    Assert.assertEquals("ToolsQA", Title);
			}
		
	/*
	 * @Test (priority=2) public void loginTest() throws InterruptedException {
	 * String Title = loginpage.login(prop.getProperty("username"),
	 * prop.getProperty("password")); Assert.assertEquals(Title,
	 * "Login - My Store");
	 
			
	}*/
			
	@AfterMethod	
	public void teardown() {
		driver.quit();
	}
		

	}

