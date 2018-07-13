package org.puma.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class CartPage {
	public WebDriver driver;
	@FindBy(xpath="//div[@class='add-to-cart-buttons']//button")
	private WebElement eleCartButton;

	
	@FindBy(css="div.product-size-click-btn")
	private WebElement eleSizeBox;
	
	@FindBy(xpath="//div[@class='product-size-click-btn']/../../..//a[contains(@id,'swatch')]")
	private WebElement eleSize;
	
	@FindBy(xpath="//select[@name='qty']")
	private WebElement eleSelectBox;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void size() throws Exception
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(eleSizeBox));
		wait.until(ExpectedConditions.elementToBeClickable(eleSizeBox));
		//Thread.sleep(1000);
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		eleSize.click();
	}
	public void select() throws Exception
	{
		Thread.sleep(4000);
		Select select=new Select(eleSelectBox);
		select.selectByIndex(0);
		//eleCartButton.click();
	}
	
	
}
