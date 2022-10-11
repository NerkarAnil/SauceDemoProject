package com.SauceDemo.POMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class _2homepagePOMclass 
{
	//POM Class steps
			//1.WebDriver driver declare
			//2.ele find by @FindBy Annotation
			//3.created a method to perform a action on element
			//4.Constructor creat
		
      public static   WebDriver driver;
         
         @FindBy(xpath="//button[@id='react-burger-menu-btn']")
        public WebElement menubutton;
         
         public  void clickonMenubutton()
         {
        	 menubutton.click();
         }
         
         @FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement logoutbuton;
         
         public void clickonLogoutclick()
         {
        	 logoutbuton.click();
         }
         //Creat constructor
         public _2homepagePOMclass(WebDriver driver)
         {
        	 this.driver=driver;
        	 PageFactory.initElements(driver,this);
        	 
         }
         //add to card of bag
     @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement clickbag;
     public void ClickOnBag()
     {
    	 clickbag.click();
     }
     //add to cart element
     @FindBy(xpath="//a[@class='shopping_cart_link']")private  WebElement clickOnCart;

         
     public String getTextFromclickOnCart()
     {
    	 String totalProducts=clickOnCart.getText();
    	 return totalProducts;
     }
    	 
    	 //multiple product select
    	 @FindBy(xpath=" //button[text()='Add to cart']")
    	private List<WebElement> Allproducts;
    	 
    	 public void Addto_Allproducts()
    	 {
    		 for(WebElement i:Allproducts)
    		 {
    			 i.click();
    		 }
    	 }
    	 
    		 //dropDown Element find
    		 
    		 @FindBy(xpath="//select[@class='product_sort_container']")
            	private	 WebElement dropDown;
    		 
    		 public void DropDownfilter()
    		 {
    			 dropDown.click();
    			 
    			 Select S=new Select(dropDown);
    			 S.selectByValue("lohi");
    		                     //za
    		 }
    		 @FindBy(xpath="//option[@value='hilo']")private WebElement DropTextmsg;
  
    		 public  String GetText()
    		 {
    			String Result= DropTextmsg.getText();
    			return Result;
    		 }
    		 
    		 
    		 }                     
    	 
    	 
     

