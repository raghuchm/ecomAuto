package pages;

import org.openqa.selenium.By;

import browsers.BrowserInstance;
import testing.PageObject;

public class CatPage extends PageObject {

	BrowserInstance driver;
	public CatPage(BrowserInstance browser) {
		super(browser);
		driver =browser;
	}

	@Override
	public boolean waitForLoaded() {
		
		return driver.isElementDisplayed(categoriesText);
	}
	By categoriesText= By.xpath("//app-dashboard/section//h6[text()='Categories']");
By categories= By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/section[1]/form[1]/div[3]/div[2]/input[1]");
By msg= By.cssSelector("#res");

public boolean categories1() throws InterruptedException
{
	boolean categoryValidation = false;
//	Thread.sleep(3000);
	if(waitForLoaded())
	{
		driver.click(categories);
		Thread.sleep(3000);
		String message=driver.getText(msg);
		if(message.contains("2"))
			{
			categoryValidation= true;
			
			}
		//else
			
			//return false;
	}
	return categoryValidation;




}

}
