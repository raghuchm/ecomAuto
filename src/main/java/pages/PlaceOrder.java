package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import browsers.BrowserInstance;
import testing.PageObject;

public class PlaceOrder extends PageObject
{

	public PlaceOrder(BrowserInstance browser)
	{
		super(browser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean selectCountry() throws InterruptedException
	{
		driver.click(chkButton);
		driver.sendKeys(Country,"Ind");
		//driver.click(cNamelist);
		List<WebElement> listCountry=driver.getListOfElements(cNameList);
		
		for(int i=0;i<listCountry.size();i++)
		{
			String c=listCountry.get(i).getText();
			System.out.println(c);
			if(c.equalsIgnoreCase("India"))
			{
				Thread.sleep(3000);
				listCountry.get(i).click();
				Thread.sleep(3000);
				break;
			}
			
		} 
		JavascriptExecutor js=driver.getJavaScriptEXecutor();
	js.executeScript("window.scrollBy(0,600)");
		driver.click(placeorder);
		return true;
	}
	By chkButton=By.xpath("//button[contains(text(),'Checkout')]");
	By Country=By.xpath("//input[@placeholder='Select Country']");
	By cName=By.xpath("//button/span[text()=' India']");
	By cNameList=By.xpath("//button/span");
	By placeorder=By.cssSelector("div .actions a");
}
