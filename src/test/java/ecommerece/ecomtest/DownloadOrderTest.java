package ecommerece.ecomtest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.AddToCartPage;
import pages.DownloadOrderPage;
import pages.LoginPage;
import pages.PlaceOrder;
import testing.WebDriverTest;

public class DownloadOrderTest  extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	AddToCartPage addToCart_page;
	PlaceOrder po;
	DownloadOrderPage dpage;
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
		dpage= new DownloadOrderPage(driver);
		po.selectCountry();
		
	}
	
	@Test
	public  void validateDownload()

	{
		dpage.fileDownload();
		
	}
}
