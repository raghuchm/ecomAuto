package ecommerece.ecomtest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.DeleteFirstTwo;
import pages.LoginPage;
import pages.ScreenshotAfterDelete;
import testing.WebDriverTest;

public class ScreenshotAfterDeleteTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	DeleteFirstTwo delete_first_two;
	ScreenshotAfterDelete scd;
	@BeforeClass
	public void initalize() throws InterruptedException, IOException
	{
		driver=browser.get();
		login_page=new LoginPage(driver);
		login_page.launchApplication();
		login_page.login("veenavj.sauvg@gmail.com", "Sauvg@1143");	
		scd=new ScreenshotAfterDelete(driver);
	}
	
	@Test
	public void captureScreenshot()
	{
		scd.getScreenshot();	
	}

}
