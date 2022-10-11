package com.SauceDemoTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses._1LoginPagePOMclass;
import com.SauceDemo.POMclasses._2homepagePOMclass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

import BasePack.TestBaseClass;

public class TC_03VerifyBagAddtofunctionality extends TestBaseClass
{
	@Test
	public void verify_bagProductFunct() throws IOException
	{
	
		
		//Reach on homepage
		//select bag product
		 Logger log= Logger.getLogger("SauceDemoProjects");
		
		_2homepagePOMclass x=new _2homepagePOMclass (driver);
		x.ClickOnBag();
		log.info("bag product is selected");
		
		ScreenShotClass.ScreenShotMethod(driver);
		
		//apply validation
		String Expectedproduct="1";
	   String ActualProduct=x.getTextFromclickOnCart();
	   log.info("Product quantity is:"+ActualProduct);
	   
		Assert.assertEquals(ActualProduct, Expectedproduct,"Failure due to title mismatch");
		
}
}
		
		
	


