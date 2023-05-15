package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browsers.BrowserInstance;
import testing.PageObject;

public class AddRequiredProduct extends PageObject{

	public AddRequiredProduct(BrowserInstance browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	By all_prod=By.xpath("//h5/b");
	By cart_btn=By.xpath("//button[contains(text(),' Add To Cart')]");
	By num=By.xpath("//ul/li[4]/button/label");
	public boolean Cart(String name)
	{
		String[] list=name.split(",");
		
		List<WebElement> prod_list=driver.getListOfElements(all_prod);
		List<WebElement> btn_list=driver.getListOfElements(cart_btn);
		for(int i=0;i<prod_list.size();i++)
		{
			for(int j=0;j<list.length;j++)
			{
				String s=prod_list.get(i).getText();
				if(s.contains(list[j]))
				{
					System.out.println(list[j]);
					btn_list.get(i).click();
					driver.sleep(3000);
					
					
				}
			}
		}
		
		String count=driver.getElementText(num);
		int z=list.length;
		String size=Integer.toString(z);
		if(count.equals(size))
			return true;
		else 
			return false;
		
		
	}

}
