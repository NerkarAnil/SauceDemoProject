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


public class TC_04VerifyAllProductAddFunctionality extends TestBaseClass
{

	 Logger log= Logger.getLogger("SauceDemoProjects");
	 
		  @Test
		  public void verifyAllProductFunc() throws IOException
		  {
		  _2homepagePOMclass All=new _2homepagePOMclass(driver);
		  All.Addto_Allproducts();
		  log.info("all products are selected");
	
		  ScreenShotClass.ScreenShotMethod(driver);
		  
		  //apply validation
		  String Expectedproduct="6";
		  String ActualProduct=All.getTextFromclickOnCart();
		  log.info("no of products are="+ActualProduct);

		  Assert.assertEquals(Expectedproduct, ActualProduct);
		  
		  
		  
		  
		  }
		  
		
} 
		  
	


