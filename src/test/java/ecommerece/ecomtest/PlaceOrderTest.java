package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.PlaceOrder;
import testing.WebDriverTest;

public class PlaceOrderTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	AddToCartPage addToCart_page;
	PlaceOrder po;
	@BeforeClass
	public void initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		addToCart_page=new AddToCartPage(driver);
		addToCart_page.addToCart();
		po=new PlaceOrder(driver);
		
	}
	@Test
	public void placeOrderValidation() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertTrue(po.selectCountry());
		
	}

}
