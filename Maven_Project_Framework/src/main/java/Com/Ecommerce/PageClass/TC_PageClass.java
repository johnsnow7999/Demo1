package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.TC_BaseClass;

public class TC_PageClass extends TC_BaseClass {

	public TC_PageClass()
	{	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	public WebElement username ;
	
	@FindBy(id = "Password")
	public WebElement pass ;
	
	@FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
	public WebElement loginbutton;
	
	public void Username(String uname)
	{
		username.sendKeys(uname);
	}
	public void Password(String password1)
	{
		pass.sendKeys(password1);
	}
	public void Login()
	{
		loginbutton.click();
	}
}
