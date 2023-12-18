package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.CatPage;
import pages.LoginPage;
import testing.WebDriverTest;

public class CategoryTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	CatPage cat;
	
	@BeforeClass
	public void initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		cat= new CatPage(driver);
	}
	@Test
	public void category() throws InterruptedException
	{
		Assert.assertTrue(cat.categories1());
		
		
	}
}
