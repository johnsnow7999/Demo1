package Com.Ecommerce.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Ecommerce.PageClass.TC_PageClass;

public class TC_LoginTestCase extends TC_PageClass{
	@Test
	public void logintestcase()
	{
		
		TC_PageClass pageclass = new TC_PageClass() ;
		
		pageclass.Username("abcd@gmail.com");
		
		pageclass.Password("admin123");
		
		pageclass.Login();
		
		
		
		
	}

}
