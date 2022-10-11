package com.SauceDemoTestClasses;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses._2homepagePOMclass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

import BasePack.TestBaseClass;


public class TC_5VerifyDropDownFunct extends TestBaseClass
{
	 Logger log= Logger.getLogger("SauceDemoProjects");
	 
	@Test
	public void VerifyDropDown() throws IOException
	{
		_2homepagePOMclass dropbox=new _2homepagePOMclass(driver);
		dropbox.DropDownfilter();
		
		ScreenShotClass.ScreenShotMethod(driver);
		
		String ExpectedText="Price (high to low)";
		String ActualText=dropbox.GetText();
		log.info("dropFiltertext:"+ActualText);
				
	Assert.assertEquals(ExpectedText, ActualText);
			
				}
	}


