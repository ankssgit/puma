package com.puma.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baselib implements IAutoConst {

static public WebDriver driver;
static
{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	//System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
}
  @BeforeMethod
  public void OpenApplication() throws Exception
   {
	 driver=new ChromeDriver();
	 Property p1=new Property();
	 String url=p1.property("URL");
	 driver.manage().window().maximize();
	 driver.get(url);
	
   } 
  
  @AfterMethod
  public void CloseApplication()
   {
	 driver.close();
   }
}
