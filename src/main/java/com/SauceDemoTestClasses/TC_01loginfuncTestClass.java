package com.SauceDemoTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses._1LoginPagePOMclass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

import BasePack.TestBaseClass;

public class TC_01loginfuncTestClass extends TestBaseClass
{	
		  @Test                        //Executes in 2 times(invocationCount=2)
		  public void verify_login_Functionality() throws IOException
		  {
			  Logger log= Logger.getLogger("SauceDemoProjects");
			  
			  log.info("apply validation");
			  
		  String ExpectedTitle="Swag Labs";        //by BA/Dev.
	      String ActualTitle=driver.getTitle();
		  
	      ScreenShotClass.ScreenShotMethod(driver);
	    
	      Assert.assertEquals(ActualTitle, ExpectedTitle);
	      
	      
	      
	      
		  }
		  
		  
		 
}

		  


