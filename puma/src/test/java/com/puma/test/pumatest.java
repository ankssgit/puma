package com.puma.test;

import org.puma.page.HomePage;
import org.puma.page.ProductPage;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.puma.generic.BasePage;
import com.puma.generic.Baselib;

public class pumatest extends Baselib {

	@Test
	public void testApplication() throws Exception
	{
		Reporter.log("Test Passed", true);
		BasePage b1=new BasePage();
		b1.pagetitle(driver);
		
		HomePage h1=new HomePage(driver);
        h1.menshoe();
        
        ProductPage p1=new ProductPage(driver);
        p1.shoeclick();
   }

}
