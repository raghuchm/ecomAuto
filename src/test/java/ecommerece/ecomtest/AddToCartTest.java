package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.AddToCartPage;
import pages.LoginPage;
import testing.WebDriverTest;

public class AddToCartTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	AddToCartPage addToCart_page;
	@BeforeClass
	public void initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		addToCart_page=new AddToCartPage(driver);
		
	}
	@Test
	public void addToCartValidation() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertTrue( addToCart_page.addToCart());
		
	}
	
	

}
