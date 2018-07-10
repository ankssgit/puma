package org.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.puma.generic.BasePage;
import com.puma.generic.JavaScript;

public class ProductPage extends BasePage {

	@FindBy(xpath="	//ul[contains(@class,'first last odd')]//li[@class='item last'][2]")
	private WebElement eleShoe;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	 
	public void shoeclick()
	{
		JavaScript j=new JavaScript();
		j.Scroll();
		eleShoe.click();
	}
}
