package pages;

import java.io.File;
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
	//String name="order-invoice_veenavj.sauvg";
	public boolean fileDownload()
	{
		driver.click(download);
		File f=driver.getDefaultDownloadDirectory();
		System.out.println(f);
		String filename="order-invoice_veenavj.sauvg.xlsx";
        File[] files = f.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) 
                {
                	String comp=file.getName();
                    System.out.println("Filename: " + comp);
                    if(filename.equals(comp))
                    {
                    	return true;
                    }
                    
                }
            }
            
        }
		return false;
		
		
	}
	

}
