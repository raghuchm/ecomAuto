package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import browsers.BrowserInstance;
import testing.PageObject;

public class AddToCartPage extends PageObject
{
	BrowserInstance driver;
	 By productname=By.xpath("//div[h5[b[contains(text(),'adidas original')]]]//button[contains(text(),'Add')]");
	 By msg=By.xpath("//h3[contains(text(),'adidas')]");
	 By prod=By.cssSelector(".mb-3");
	 By toast=By.cssSelector("#toast-container");
	 By cartButton=By.xpath("//button[contains(text(),'Cart')]");
	 String s="Zara,IPhone,Addidas";
	 String []ss=s.split(",");
	// System.out.println(ss);
	public AddToCartPage(BrowserInstance browser) 
	{
		super(browser);
		driver=browser;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean waitForLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	 public boolean addToCart() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 driver.click(productname);
		 driver.click(cartButton);
		 Thread.sleep(3000);
		 return driver.isElementDisplayed(msg);
	 }
	 
//	 @FindBy(css=".mb-3")
//		List<WebElement> product;
//		
//		@FindBy(css=".ng-animating")
//		WebElement msg;
//		
//		By prod=By.cssSelector(".mb-3");
//		By toast=By.cssSelector("#toast-container");
//		
//		
//		//driver.findElement(By.cssSelector(".totalRow button")).click();
//		
//		@FindBy(css=".totalRow button")
//		WebElement checkout;
////b[contains(text(),'adidas original')]
	//div[h5[b[contains(text(),+cartName+)]]]//button[contains(text(),'Add')]
	
}
