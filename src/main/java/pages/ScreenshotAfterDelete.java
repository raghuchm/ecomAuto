package pages;

import java.io.File;

import org.openqa.selenium.By;

import browsers.BrowserInstance;
import testing.PageObject;

public class ScreenshotAfterDelete extends PageObject
{
	BrowserInstance driver;

	public ScreenshotAfterDelete(BrowserInstance browser) 
	{
		super(browser);
		driver=browser;
		
	}

	@Override
	public boolean waitForLoaded() 
	{
			return false;
	}
	
	By img=By.id("toast-container");
	By order_button= By.xpath("//button[contains(text(),'ORDERS')]");
	By delete_button=By.xpath("//tr[1]/td/button[contains(text(),'Delete')]");
	
	
	public void getScreenshot()
	{
		String src="E://selenium_workspace//ecomAuto/src//main//java//utils//screenshot.png";
		driver.click(order_button);
		driver.click(delete_button); 
		if(driver.isElementFound(img))
		{
		   File file=driver.takeScreenShot(src);
		}
	}

}
