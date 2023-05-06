package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import browsers.BrowserInstance;
import testing.PageObject;

public class DeleteSingleItem extends PageObject
{
	BrowserInstance Driver;
	

	public DeleteSingleItem(BrowserInstance browser) {
		super(browser);
		Driver=browser;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	
	By delete_Button= By.xpath("//tbody/tr/td[6]/button");
	By row=By.xpath("//tbody/tr/th");
	By toast_msg=By.id("toast-container");
	By order_id= By.xpath("//th[contains(text(),'64568d35568c3e9fb1657cf7')]");
	
//	public void deleteFirstOrder()
//	{
//		Driver.click(delete_Button);
//		
//	}
	
	public boolean deleteList()
	{
		List<WebElement> elements=Driver.getListOfElements(row);
		List<WebElement> button= Driver.getListOfElements(delete_Button);
		int j=0;
		int count=elements.size();
		for(int i=0;i<elements.size();i++) 
		{
			String s=elements.get(i).getText();
			System.out.println(s);
			if(s.equals("64568d35568c3e9fb1657cf7"))
			{
				
				
				int x=button.get(i).getLocation().getX();
				int y=button.get(i).getLocation().getY();
				JavascriptExecutor js=driver.getJavaScriptEXecutor();
				js.executeScript("window.scrollBy("+x+","+y+")");
				driver.sleep(3000);
				button.get(i).click();
				
				
				driver.sleep(3000);
				//driver.waitForElementDisappear(toast_msg,5);
				break;
				//s=elements.get(i).getText();
				
			}
			
			
			
		}
		return Driver.isElementDisplayed(order_id);
		
	}

}
