package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browsers.BrowserInstance;
import testing.PageObject;

public class OpenNewTab extends PageObject
{

	public OpenNewTab(BrowserInstance browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	By more=By.xpath("//div[@class='exehdJ']");
	By options=By.xpath("//div/ul/li");
	By close=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	Keys k = Keys.CONTROL;
	WebElement w;
	
	public void newTab()
	{
		
		driver.click(close);
		driver.mouseover(more);
		List<WebElement> list= driver.getListOfElements(options);
		
	 for(int i=0;i<list.size();i++)
	{
		w=list.get(i);
		driver.clickElementWithCtrlKeyPressed(w, k);
		driver.mouseover(more);
		list= driver.getListOfElements(options);
		
	
	}

		

}}
