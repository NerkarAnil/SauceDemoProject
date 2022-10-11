package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _1LoginPagePOMclass 
{
	//POM Class steps
		//1.WebDriver driver declare
		//2.element find by @FindBy Annotation
		//3.created a method to perform a action on element
		//4.Constructor create
		

	//1. declare driver
	public static WebDriver driver;
	
	//2.Element find
	//i)for Username
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;

	//3.Creat method as per action on element and add action in that mtd(
	public void sendUsername() 
	{
		username.sendKeys("performance_glitch_user");
	}
	
	//ii)For Password
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	//method
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	//iii)for Clickon login
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginbutton;
	
	public void sendLoginbutton()
	{
		loginbutton.click();
	}
	
	//4.Creat a constructor
	public _1LoginPagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		   //global   local
		
		//sele class
		PageFactory.initElements(driver,this);
		
		
	}
		
	
	
}
