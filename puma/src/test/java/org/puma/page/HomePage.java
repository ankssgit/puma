package org.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.puma.generic.BasePage;

public class HomePage extends BasePage{
	//public WebDriver driver;
	
	@FindBy(xpath="//a[@data-subnav='men-subnav']")
	private WebElement elemenLink;
	
	@FindBy(xpath="//li[@id='men-subnav']//a[.='Shoes']/../../..//a[.='Running']")
	private WebElement eleRunning;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void menshoe() throws Exception
	{
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(elemenLink).perform();
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(eleRunning));
		eleRunning.click();
	}
	
}
