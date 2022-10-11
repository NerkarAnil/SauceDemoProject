package com.SauceDemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{
	
	public static void ScreenShotMethod(WebDriver driver) throws IOException
	{
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy&HH-MM-SS");
	    String date=d1.format(d);
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File SeleFile=ts.getScreenshotAs(OutputType.FILE);
	    File MyFile=new File("./ScreenshotFolder\\Saucedemo"+date+".png");
	    FileHandler.copy(SeleFile, MyFile);
	    
	}}
	
//	String  Screenshotname        Screenshotname

