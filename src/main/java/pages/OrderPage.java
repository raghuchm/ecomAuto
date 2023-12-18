package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import browsers.BrowserInstance;
import testing.PageObject;

public class OrderPage extends PageObject
{
	BrowserInstance driver;
	
	public OrderPage(BrowserInstance browser) 
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
	
	
	
	By ordre_button= By.xpath("//button[contains(text(),'ORDERS')]");
	By msg=By.xpath("//h1[contains(text(),'Your Orders')]");
	By prodname_list=By.xpath("//tbody");
	By allList=By.xpath("//tbody//tr//td[2]");
	By deleteButton=By.xpath("//tbody/tr/td[6]/button");
	By toast_msg=By.id("toast-container");
	
	
	public boolean goToOrderPage() throws InterruptedException
	{
		int count=0;
		driver.click(ordre_button);
		Thread.sleep(3000);
		// this below line of code will fetch all the names of the product from order list
		List<WebElement> names=driver.getListOfElements(allList);
		// Its list of the delete button
		List<WebElement> btn_list=driver.getListOfElements(deleteButton);
		// logic is to delete all the addidas orders from the list
		for(int i=0;i<names.size();i++)
		{
			
			String c=names.get(i).getText();
			System.out.println(c);
			if(c.equalsIgnoreCase("adidas original"))
			{
				
				btn_list.get(i).click();
				driver.waitForElementDisappear(toast_msg,5);
			}
			
			names=driver.getListOfElements(allList);
			btn_list=driver.getListOfElements(deleteButton);
		}
		
		return driver.isElementDisplayed(msg);
		
		
	}
	
	
	}
	


