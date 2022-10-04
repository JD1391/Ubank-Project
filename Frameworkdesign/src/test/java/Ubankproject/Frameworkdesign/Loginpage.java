package Ubankproject.Frameworkdesign;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import login.pageobjects.LoginPageobjects;

public class Loginpage {
	
	
	@Test
	public void Loginpageebay() {
	

	        WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    LoginPageobjects landingPage = new LoginPageobjects(driver);
		    landingPage.goTo();
		   
		    landingPage.loginApplication();
		    Reporter.log("ebay application is launched & Sign button is clicked and browser window is closed");

		   
		    
	}
	
}
	
	
	
	
	
	
	
