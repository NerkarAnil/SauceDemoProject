package BasePack;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMclasses._1LoginPagePOMclass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

public class TestBaseClass 
{
	
 public WebDriver driver;
 
  Logger log= Logger.getLogger("SauceDemoProjects");
  
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./DriverFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		 PropertyConfigurator.configure("log4j.properties");
		 log.info("browser is open");
		 
		driver.manage().window().maximize();
		log.info("Window is maximize");
		
		driver.get("https://www.saucedemo.com/");
		log.info("url is open");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		

		//loginPage elements find and action perform
		
		_1LoginPagePOMclass x=new _1LoginPagePOMclass (driver);
		  x.sendUsername();
		  log.info("username is enter");
		  x.sendPassword();
		  log.info("password is enter");
		  x.sendLoginbutton();
		  log.info("click on loginbutton");
	
		  
		  //Take a Screenshot
//		  ScreenShotClass sc=new ScreenShotClass();
//		  sc.ScreenShotMethod("A_homepagesc", driver);
//		  System.out.println("Screenshot of login page");
		  
		   
		  ScreenShotClass.ScreenShotMethod(driver);
		  log.info("Screenshot is done");
	}
	
		  @AfterMethod
		  public void tearDown()
		  {
		  driver.close();
          
		  log.info("end of programs");
		 
		  }

}
