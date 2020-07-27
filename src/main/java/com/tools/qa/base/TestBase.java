package com.tools.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.tools.qa.util.TestUtil;
import com.tools.qa.util.WebEventListener;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver	e_driver;
	public static WebEventListener eventListener;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:/eclipse/Workspace/toolsqa/src/main/java/com/tools/qa/config/config.properties");
		   prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

	
	public static void initialization() {
		
		String Browsername = prop.getProperty("browser");
		if (Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:/Selenium 2020/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (Browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","E:/Selenium 2020/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();			
		}
			
			
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}
}
