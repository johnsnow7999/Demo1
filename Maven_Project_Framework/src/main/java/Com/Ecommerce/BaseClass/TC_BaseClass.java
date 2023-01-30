package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_BaseClass {

	public static WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "F://Installer//chromedriver.exe");
		
		driver = new ChromeDriver() ;
		
		driver.manage().window().maximize() ;
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F") ;
		
		

		
		
		
	}
	

}
