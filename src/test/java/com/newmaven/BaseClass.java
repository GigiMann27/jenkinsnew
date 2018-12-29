package com.newmaven;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/Users/Gurpreet/eclipse-workspace/com.maventestNgJen/Drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");	
	}
	
}
