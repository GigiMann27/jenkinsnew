package com.newmaven;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");	
	}
	
}
