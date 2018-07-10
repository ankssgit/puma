package org.puma.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.puma.generic.BasePage;
import com.puma.generic.JavaScript;

public class ProductPage  {
    public WebDriver driver;
	@FindBy(xpath="	//ul[contains(@class,'first last odd')]//li[@class='item last'][2]")
	private WebElement eleShoe;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	 
	public void shoeclick() throws Exception
	{
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		eleShoe.click();
	}
}
