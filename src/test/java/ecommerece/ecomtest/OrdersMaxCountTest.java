package ecommerece.ecomtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;

import pages.LoginPage;
import pages.OrderMaxCount;
import pages.OrderPage;
import testing.WebDriverTest;

public class OrdersMaxCountTest extends WebDriverTest 
{
	BrowserInstance driver;
	LoginPage Login_Page;
	OrderMaxCount order_Max;
	
	@BeforeClass
	public void initialize() throws IOException, InterruptedException
	{
	driver=browser.get();
	Login_Page= new LoginPage(driver);
	order_Max=new OrderMaxCount(driver);
	Login_Page.launchApplication();	
	Login_Page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
	
	}

@Test
public void orderMaCount()
{
	Assert.assertTrue(order_Max.orderCount());
}
}

