package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.AddRequiredProduct;
import pages.AddToCartPage;
import pages.LoginPage;
import testing.WebDriverTest;
import utils.PropertyfileData;

public class AddRequiredProductTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	AddRequiredProduct addToCart_page;
	@BeforeClass
	public void initialize() throws IOException, InterruptedException
	{
		driver=browser.get();
		login_page= new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");
		addToCart_page=new AddRequiredProduct(driver);
		
		
	}
	@Test
	public void addToCartValidation() throws InterruptedException, IOException
	{
		String name=PropertyfileData.getPropertyFileData("name");
		Assert.assertTrue(addToCart_page.Cart(name));	
	}

}
