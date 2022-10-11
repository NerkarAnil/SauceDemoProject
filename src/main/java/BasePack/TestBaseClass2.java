package BasePack;

 import java.io.IOException;
import java.time.Duration;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.SauceDemo.POMclasses._1LoginPagePOMclass;
import com.SauceDemo.POMclasses._2homepagePOMclass;

public class TestBaseClass2 
{
	 public static WebDriver driver;
		
		@BeforeMethod
		public void setUp() throws IOException
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium Folder\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			System.out.println("browser is open");
			driver.manage().window().maximize();
			System.out.println("Window is max");
			driver.get("https://www.saucedemo.com/");
			System.out.println("url is open");
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			
       
          
			_1LoginPagePOMclass x=new _1LoginPagePOMclass (driver);
			  x.sendUsername();
			  System.out.println("username is enter");
			  x.sendPassword();
			  System.out.println("password is enter");
			  x.sendLoginbutton();
			  System.out.println("click on loginbutton");
            }
			
			@AfterMethod
			public void logout()
			{
				//LogOut click
			
				_2homepagePOMclass a=new _2homepagePOMclass(driver);
				a.clickonMenubutton();
				System.out.println("menu button is clicked");
				a.clickonLogoutclick();
				System.out.println("click on logout button");
			
				
				
				  
				  driver.close();
		          
				  System.out.println("end of programs");
				 
				  }
				
}
			

