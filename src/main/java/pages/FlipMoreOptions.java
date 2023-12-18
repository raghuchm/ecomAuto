package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browsers.BrowserInstance;
import testing.PageObject;

public class FlipMoreOptions  extends PageObject
{

	public FlipMoreOptions(BrowserInstance browser) {
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
	//Keys k = Keys.CONTROL;
	//WebElement name;
	
	
	
	public boolean moreOptions()
	{
		
		driver.click(close);
		driver.mouseover(more);
		String[] optlist= {"Notification Preferences","24x7 Customer Care","Advertise","Download App"};
		List<WebElement> list= driver.getListOfElements(options);
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			String optname=list.get(i).getText();
			System.out.println(optname);
			
			for(int j=0;j<optlist.length;j++)
			{
				if(optlist[j].equalsIgnoreCase(optname))
				{
					
					count++;
				}
				
			}
			
			
		}
		
		
		if(count==4)
		{
			return true;
		}
		else return false;
		
		
		
	}
}


