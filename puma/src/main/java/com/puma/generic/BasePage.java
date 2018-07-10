package com.puma.generic;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {
 
	public WebDriver driver;
	/*public BasePage(WebDriver driver)
	{
		
     this.driver=driver;//"this.driver" is current class driver whereas "driver" is coming from test class
	}*/
	public void pagetitle(WebDriver driver)
	{
		System.out.println("Title is Asserted");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "PUMA.COM | Forever Faster", "Title is Asserted");
		
	}
	
}

