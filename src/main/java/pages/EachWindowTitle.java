package pages;

import java.util.Iterator;
import java.util.Set;

import browsers.BrowserInstance;
import testing.PageObject;

public class EachWindowTitle extends PageObject
{

	public EachWindowTitle(BrowserInstance browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	public boolean ValidateTabTitles()
	{
		
		Set<String> windowhandle= driver.getWindowHandles();
//		for(String handle: windowhandle)
//		{
//			driver.switchToWindow(handle, 1);
//			System.out.println(driver.getTitle());
//		}
		Iterator<String> it=windowhandle.iterator();
		while(it.hasNext())
		{
			driver.switchToWindow(it.next(), 3);
			System.out.println(driver.getTitle());
		}
		return true;
	}
	

}
