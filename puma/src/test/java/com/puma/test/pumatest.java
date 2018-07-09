package com.puma.test;

import org.puma.page.HomePage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.puma.generic.BasePage;
import com.puma.generic.Baselib;

public class pumatest extends Baselib {

	@Test
	public void testApplication() throws Exception
	{
		Reporter.log("Test Passed", true);
		BasePage b1=new BasePage(driver);
		b1.pagetitle();
		
		HomePage h1=new HomePage(driver);
         h1.menshoe();
   }

}
