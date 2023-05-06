package pages;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browsers.BrowserInstance;
import io.cucumber.core.internal.com.fasterxml.jackson.core.type.TypeReference;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import testing.PageObject;
import utils.PropertyfileData;

public class LoginPage extends PageObject
{
	BrowserInstance driver;
	public LoginPage(BrowserInstance browser)
	{
		super(browser);
		driver=browser;
		// TODO Auto-generated constructor stub
//		PageFactory.initElements(browser, this);
	
	}

	@Override
	public boolean waitForLoaded()
	{
		// TODO Auto-generated method stub
		return false;
	}
	
//	@FindBy(id="userEmail")
//	WebElement email;
//	
//	@FindBy(id="userPassword")
//	WebElement password;
//	
//	@FindBy(id="login")
//	WebElement submitbutton;
//	
//	@FindBy(xpath="//button[contains(text(),'HOME')]")
//	WebElement home_icon;
	By email=By.id("userEmail");
	By password= By.id("userPassword");
	By submitbutton=By.id("login");
	By home_icon=By.xpath("//button[contains(text(),'HOME')]");
	By home_display=By.xpath("//h3[contains(text(),'Automation')]");
	
	public void launchApplication() throws IOException {
        driver.loadURL(PropertyfileData.getPropertyFileData("url"));
        
    }
	
	public List<HashMap<String, String>> readJson() throws Exception
	{
		
		String jsondata=FileUtils.readFileToString(new File("D://workspace//ecomtest//src//test//java/resources//generalData.json"),StandardCharsets.UTF_8);
		ObjectMapper obj=new ObjectMapper();
		List<HashMap<String,String>> data=
		obj.readValue(jsondata, new TypeReference<List<HashMap<String,String>>>(){});
		return data;
		
	}
	
	public boolean login(String emailValue, String passwordValue) throws InterruptedException
	{
		driver.sendKeys(email,emailValue);
		driver.sendKeys(password,passwordValue);
		driver.click(submitbutton);
		Thread.sleep(5000);
		return driver.isElementDisplayed(home_display);
		
		
	}

	
}
