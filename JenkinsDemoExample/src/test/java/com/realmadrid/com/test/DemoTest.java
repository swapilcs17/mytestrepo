package com.realmadrid.com.test;
import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTest {

	
	@Test
	public void googleTest() {

		System.setProperty("webdriver.gecko.driver", "C:\\Tinu_Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.quit();
	}
	
	
	@Test
	public void gmailTest() {

		System.setProperty("webdriver.gecko.driver", "C:\\Tinu_Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.quit();
	}
	

}
