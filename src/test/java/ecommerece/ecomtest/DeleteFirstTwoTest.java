package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.DeleteFirstTwo;
import pages.LoginPage;
import pages.OrderPage;
import testing.WebDriverTest;

public class DeleteFirstTwoTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	OrderPage order_page;
	DeleteFirstTwo delete_first_two;
	
	@BeforeClass
	
	public void initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		login_page=new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		delete_first_two=new DeleteFirstTwo(driver);
	}
	@Test
	public void delete()
	{
		
		
		boolean flag=delete_first_two.FirstTwoDel();
		
		
		Assert.assertTrue(flag);
	}

}
