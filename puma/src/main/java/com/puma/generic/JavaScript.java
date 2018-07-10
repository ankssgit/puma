package com.puma.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScript {

	
	public static WebDriver driver;
	public void Scroll()
	{
		driver=new ChromeDriver();
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,-500");
	}
}
