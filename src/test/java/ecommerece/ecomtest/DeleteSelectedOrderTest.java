package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.DeleteSelectedOrder;
import pages.LoginPage;
import pages.OrderPage;
import testing.WebDriverTest;

public class DeleteSelectedOrderTest extends WebDriverTest
{

	BrowserInstance driver;
	LoginPage login_page;
	OrderPage order_page;
	DeleteSelectedOrder del_order;
	@BeforeClass
	public void initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		order_page=new OrderPage(driver);
		//order_page.goToOrderPage();
		del_order=new DeleteSelectedOrder(driver);
		
	}
	@Test
	public void deleteValidation() throws InterruptedException
	{
		Assert.assertTrue( del_order.deleteOrder("646a2b8e568c3e9fb17223b8"));
		
	}
}
