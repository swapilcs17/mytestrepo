package com.realmadrid.com.test;
import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CNN {

	public static void main(String[] args) {
		
		String name = "ICC";

		System.setProperty("webdriver.gecko.driver", "C:\\Tinu_Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://CNN.com");
		String text=driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[1]/ul/li[1]/article/a/h2")).getText();
		System.out.println(text);
		driver.findElement(By.id("search-button")).click();
		driver.findElement(By.id("search-input-field")).sendKeys("Real Madrid");
		driver.findElement(By.id("search-input-field")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.getTitle();
	}

}
