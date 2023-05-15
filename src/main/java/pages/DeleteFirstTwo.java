package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browsers.BrowserInstance;
import testing.PageObject;

public class DeleteFirstTwo extends PageObject
{
BrowserInstance driver;
By order_button= By.xpath("//button[contains(text(),'ORDERS')]");
By delete_button=By.xpath("//tr/td/button[contains(text(),'Delete')]");
	public DeleteFirstTwo(BrowserInstance browser) 
	{
		super(browser);
		driver=browser;
		
	}

	@Override
	public boolean waitForLoaded()
	{
		return false;
	}
	
	public boolean FirstTwoDel()
	{
		driver.click(order_button);
		
		List<WebElement> delList= driver.getListOfElements(delete_button);
		
		int count=1,oldsize=delList.size();
		for(int i=0;i<=delList.size();i++)
		{
			delList.get(i).click();
			
			
			if(i==count)
			{
				break;
			}
			
			delList= driver.getListOfElements(delete_button);
			}
		List<WebElement> delNewList= driver.getListOfElements(delete_button);
		int newsize=delNewList.size();
		
		if(newsize==oldsize)
		{
			return false;
		}
		else 
		{
			return true;
		}
		
		
		
		
	}

}
