package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.OrderPage;
import pages.PlaceOrder;
import testing.WebDriverTest;

public class OrderPageTest extends WebDriverTest
{

	BrowserInstance driver;
	LoginPage login_page;
	OrderPage order_page;
	@BeforeClass
	public void initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		order_page=new OrderPage(driver);	
	}
	
	@Test
	public void validateOrderPage() throws InterruptedException 
	{
		Assert.assertTrue(order_page.goToOrderPage()); 
	}
}
