package pages;

import java.io.File;
import java.io.FilenameFilter;

import org.openqa.selenium.By;

import browsers.BrowserInstance;
import testing.PageObject;

public class DownloadOrderPage extends PageObject{

	public DownloadOrderPage(BrowserInstance browser)
	{
		super(browser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded()
	{
		// TODO Auto-generated method stub
		return false;	
		
	}
	
	
	By download=By.xpath("//tr/button[contains(text(),'Excel')]");
	String name="order-invoice_veenavj.sauvg";
	public void fileDownload()
	{
		driver.click(download);
		File f=driver.getDefaultDownloadDirectory();
		System.out.println(f);
		driver.sleep(3000);
		File[] files = f.listFiles((dir1, name) -> name.startsWith("order") && name.endsWith(".xlsx"));
		System.out.println(files.length);
		
		
	}
	

}
