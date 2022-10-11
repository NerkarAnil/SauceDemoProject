package com.SauceDemoTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.SauceDemo.POMclasses._1LoginPagePOMclass;
import com.SauceDemo.POMclasses._2homepagePOMclass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

import BasePack.TestBaseClass;

public class TC_02VerifylogoutFunctionality extends TestBaseClass
{

	@Test
	public void verify_logOutFunct() throws IOException 
	{
		//LogOut click
		 Logger log= Logger.getLogger("SauceDemoProjects");
		 
		_2homepagePOMclass a=new _2homepagePOMclass(driver);
		a.clickonMenubutton();
		log.info("menu button is clicked");
		a.clickonLogoutclick();
		log.info("click on logout button");
		
		ScreenShotClass .ScreenShotMethod(driver);
	
		//Apply the validation
		
		
		String Expectedtitle="Swag Labs";
		String ActualTitle=driver.getTitle();
	
		Assert.assertEquals(ActualTitle, Expectedtitle, "Failed due to title mismatch");
		
			}
		}
		
