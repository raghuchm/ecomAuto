package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browsers.BrowserInstance;
import testing.PageObject;

public class DeleteSelectedOrder extends PageObject {

	public DeleteSelectedOrder(BrowserInstance browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

	By row=By.xpath("//tbody/tr");
	By deleteButton=By.xpath("//tbody/tr/td[6]/button");
	By ordre_button= By.xpath("//button[contains(text(),'ORDERS')]");
	
	
	public boolean deleteOrder(String name)
	{
		driver.click(ordre_button);
		List<WebElement> allRows=driver.getListOfElements(row);
		for (int i=0;i<allRows.size();i++)
		{
			String s=allRows.get(i).getText();	
			if(s.contains(name))
			{
				driver.click(deleteButton);
				break;
			}
			
		}
		allRows=driver.getListOfElements(row);
		for (int i=0;i<allRows.size();i++)
		{
			String s=allRows.get(i).getText();	
			if(s.equals(name))
			{
				return false;
			}
			
		}
		return true;
		
	}
}
