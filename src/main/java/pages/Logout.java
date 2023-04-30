package pages;

import org.openqa.selenium.By;

import browsers.BrowserInstance;
import testing.PageObject;

public class Logout extends PageObject

{
	BrowserInstance driver;

	public Logout(BrowserInstance browser) {
		super(browser);
		driver=browser;
		
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	
	By logout=By.xpath("//body/app-root[1]/app-dashboard[1]/app-sidebar[1]/nav[1]/ul[1]/li[5]/button");
	By register=By.linkText("Register");
	
	public boolean logOut()
	{
		driver.click(logout);
		return driver.isElementDisplayed(register);
		
	}

}
