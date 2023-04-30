package ecommerece.ecomtest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.LoginPage;
import testing.WebDriverTest;

public class LoginTest extends WebDriverTest
{
	
	BrowserInstance driver;
	LoginPage login_page;
	
	@BeforeClass
	public void initialize() throws IOException
	{
		driver=browser.get();
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		
		
	}
	@Test
	public void loginValidation() throws InterruptedException, IOException
	{
		
		boolean flag=login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		Assert.assertTrue(flag);
	}
	
	@Test
	public void invalidPassword() throws InterruptedException, IOException
	{
	
	boolean flag=login_page.login("veenavj.sauvg@gmail.com", "");
	Assert.assertTrue(flag);
	}
	
	@Test
	public void invalidUname() throws InterruptedException, IOException
	{
	
	boolean flag=login_page.login("", "Sauvg@1143");
	Assert.assertTrue(flag);
	}
	@Test
	public void invalidUnPaswrd() throws InterruptedException, IOException
	{
	
	boolean flag=login_page.login("", "");
	Assert.assertTrue(flag);
	}

}
