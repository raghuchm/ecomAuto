package pages;

import org.openqa.selenium.By;

import browsers.BrowserInstance;
import testing.PageObject;

public class DeleteItemPage extends PageObject
{
	BrowserInstance driver;
public DeleteItemPage(BrowserInstance browser) 
{
		super(browser);
		driver=browser;
		// TODO Auto-generated constructor stub
}



@Override
public boolean waitForLoaded() 
{
	// TODO Auto-generated method stub
	return false;
}

public boolean deleteSelectedItem() throws InterruptedException
{
	driver.click(deleteButton);
	Thread.sleep(3000);
	return driver.isElementDisplayed(msg);
	
}

By deleteButton=By.xpath("//div/button[2]");
By msg=By.xpath("//h1[contains(text(),'No')]");
}
