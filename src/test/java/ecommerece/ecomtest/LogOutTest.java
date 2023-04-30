package ecommerece.ecomtest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.LoginPage;
import pages.Logout;
import testing.WebDriverTest;

public class LogOutTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	Logout log_out;
	
	@BeforeClass
	public void initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		 log_out= new Logout(driver);
	}
	@Test
	public void loginValidation() throws InterruptedException, IOException
	{
		
		
		
		Assert.assertTrue(log_out.logOut());
		
	}

}
