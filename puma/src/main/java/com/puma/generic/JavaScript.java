package com.puma.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScript {

	
	public static WebDriver driver;
	public void Scroll(WebDriver driver)
	{
		this.driver=driver;
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,-500");
		System.out.println("Page Scrolled Down");
	}
}
