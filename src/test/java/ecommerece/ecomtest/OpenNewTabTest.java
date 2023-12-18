package ecommerece.ecomtest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.FlipMoreOptions;
import pages.LoginPage;
import pages.OpenNewTab;
import testing.WebDriverTest;

public class OpenNewTabTest extends WebDriverTest 
{
	BrowserInstance driver;
	LoginPage login_page;
	FlipMoreOptions flip_more;
	OpenNewTab open_newtab;
	
	@BeforeClass
	public void initialize() throws IOException
	{
		driver=browser.get();
		login_page=new LoginPage(driver);
		login_page.launchApplication();
		
		flip_more =new FlipMoreOptions(driver);
		open_newtab= new OpenNewTab(driver);
		
		String tabname=driver.getTitle();
		System.out.println(tabname);
		
	}
	@Test
	public void newTabOpen()
	{
		open_newtab.newTab();
		
	}
	

}
