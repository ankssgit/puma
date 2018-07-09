package org.puma.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	@FindBy(xpath="//div[@class='add-to-cart-buttons']//button")
	private WebElement eleCartButton;

	
	@FindBy(xpath="//div[@class='product-size-click-btn']/../..//a[@title='7']")
	private WebElement eleSize;
	
	@FindBy(xpath="//select[@name='qty']")
	private WebElement eleSelectBox;
	
	
}
