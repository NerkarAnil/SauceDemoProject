package com.SauceDemoTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses._2homepagePOMclass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

import BasePack.TestBaseClass;

public class AllTestCheck extends TestBaseClass
{
	 @Test(priority=0)                      
	  public void verify_login_Functionality()
	  {
	  System.out.println("apply validation");
	  String ExpectedTitle="Swag Labs";        //by BA/Dev.
     String ActualTitle=driver.getTitle();
	  
     Assert.assertEquals(ActualTitle, ExpectedTitle);
	  }
	 

		@Test(priority=1)
		public void verify_logOutFunct() 
		{
			//LogOut click
		
			_2homepagePOMclass a=new _2homepagePOMclass(driver);
			a.clickonMenubutton();
			System.out.println("menu button is clicked");
			a.clickonLogoutclick();
			System.out.println("click on logout button");
		
		
			//Apply the validation
			
			
			String Expectedtitle="Swag Labs";
			String ActualTitle=driver.getTitle();
		
			Assert.assertEquals(ActualTitle, Expectedtitle, "Failed due to title mismatch");
			
				}
		@Test(priority=3,invocationCount=2)
		public void verify_bagProductFunct() throws IOException
		{
		
			
			//Reach on homepage
			//select bag product
		
			
			_2homepagePOMclass x=new _2homepagePOMclass (driver);
			x.ClickOnBag();
			System.out.println("bag product is selected");
			
			
			//apply validation
			String Expectedproduct="1";
		   String ActualProduct=x.getTextFromclickOnCart();
		   System.out.println("Product quantity is:"+ActualProduct);
		   
			Assert.assertEquals(ActualProduct, Expectedproduct,"Failure due to title mismatch");
			
	}
	@Test(priority=2)
public void verifyAllProductFunc() throws IOException
{
_2homepagePOMclass All=new _2homepagePOMclass(driver);
All.Addto_Allproducts();
System.out.println("all products are selected");

ScreenShotClass.ScreenShotMethod(driver);

//apply validation
String Expectedproduct="6";
String ActualProduct=All.getTextFromclickOnCart();
System.out.println("no of products are="+ActualProduct);

Assert.assertEquals(Expectedproduct, ActualProduct);


}
}
	 
	 
	 
	 
	 


