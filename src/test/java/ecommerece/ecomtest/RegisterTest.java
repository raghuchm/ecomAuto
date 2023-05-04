package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.LoginPage;
import pages.RegisterPage;
import testing.WebDriverTest;

public class RegisterTest extends WebDriverTest
{
	BrowserInstance driver;
	RegisterPage reg;
	LoginPage login_page;
	@BeforeClass
	public void initialize() throws IOException 
	{
		driver=browser.get();
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		reg=new RegisterPage(driver);
	}
	@Test
	public void validateRegistration()
	{
		
		Assert.assertTrue(reg.fillRegistration()); 
		
	}
}
