package ecommerece.ecomtest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.DeleteSingleItem;
import pages.LoginPage;
import pages.OrderPage;
import testing.WebDriverTest;

public class DeleteSingleItemTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage Login_page;
	OrderPage Order_page;
	DeleteSingleItem Delete_SingleItem;
	
	@BeforeClass
	public void Initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		Login_page=new LoginPage(driver);
		Login_page.launchApplication();
		Login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		Order_page=new OrderPage(driver);
		Order_page.OrderPageButton();
		Delete_SingleItem=new DeleteSingleItem(driver);
		
	}
	@Test 
	
	public void validateDelete() throws InterruptedException
	{
		
		boolean b=Delete_SingleItem.deleteList();
		Assert.assertFalse(b);
	}
	
	

}

