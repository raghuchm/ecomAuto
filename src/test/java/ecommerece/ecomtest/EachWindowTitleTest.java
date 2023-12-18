package ecommerece.ecomtest;
import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browsers.BrowserInstance;
import pages.EachWindowTitle;
import pages.LoginPage;
import pages.OpenNewTab;
import testing.WebDriverTest;

public class EachWindowTitleTest extends WebDriverTest
{
	BrowserInstance driver;
	LoginPage login_page;
	OpenNewTab open_newtab;
	EachWindowTitle each_windowtitle;
	
	
	
	
@BeforeClass
public void initialize() throws IOException
{
	driver=browser.get();
	login_page= new LoginPage(driver);
	login_page.launchApplication();
	open_newtab=new OpenNewTab(driver);
	open_newtab.newTab();
	each_windowtitle= new EachWindowTitle(driver);
	
}

@Test
public void findTitleOfAllTabs()
{
	Assert.assertTrue(each_windowtitle.ValidateTabTitles());
	  
}
}

	

	


