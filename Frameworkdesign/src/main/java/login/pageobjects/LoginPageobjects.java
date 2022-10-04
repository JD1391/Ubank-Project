package login.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageobjects {

	WebDriver driver;
	
	public LoginPageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(linkText="Sign in")
	WebElement Signin;
	

	public void goTo()
	{
		driver.get("https://ebay.com.au");
		
		
		
	}
	
	public void loginApplication()
	
	{
		Signin.click();
		driver.quit();
		
	}
	
}
