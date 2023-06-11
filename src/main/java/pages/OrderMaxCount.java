package pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browsers.BrowserInstance;
import testing.PageObject;

public class OrderMaxCount extends PageObject 
{
	

	public OrderMaxCount(BrowserInstance browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	By count=By.xpath("//tbody/tr/th");
	By ordre_button= By.xpath("//button[contains(text(),'ORDERS')]");
	
	public  boolean orderCount()
	{
		driver.click(ordre_button);
		driver.sleep(3000);
		List<WebElement> list=driver.getListOfElements(count);
		System.out.println(list.size());
		int s=list.size();
				if(s>8)
				{
					return false;
				}
				else
					return true;
		
		
	}

}
