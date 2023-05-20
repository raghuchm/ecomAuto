package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.FlipMoreOptions;
import pages.LoginPage;
import testing.WebDriverTest;

public class FlipMoreOptionsTest extends WebDriverTest 
{
	BrowserInstance driver;
	LoginPage login_page;
	FlipMoreOptions flip_more;
	
	@BeforeClass
	public void initialize() throws IOException
	{
		driver=browser.get();
		login_page=new LoginPage(driver);
		login_page.launchApplication();
		flip_more =new FlipMoreOptions(driver);
		
	}
	
	@Test
	public void validatemoreOptions()
	{
		Assert.assertTrue(flip_more.moreOptions());
	}

}
