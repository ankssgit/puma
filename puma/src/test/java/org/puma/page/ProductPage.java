package org.puma.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

	@FindBy(xpath="	//ul[contains(@class,'first last odd')]//li[@class='item last'][2]")
	private WebElement eleShoe;
	
	
}
