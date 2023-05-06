package pages;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import browsers.BrowserInstance;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import testing.PageObject;

public class RegisterPage extends PageObject{

	public RegisterPage(BrowserInstance browser) 
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
	
	By register_button=By.linkText("Register");
	By first_name= By.id("firstName");
	By last_name= By.id("lastName");
	By email= By.id("userEmail");
	By mobile= By.id("userMobile");
	By password= By.id("userPassword");
	By confirm_pwd= By.id("confirmPassword");
	By select_occ=By.cssSelector("select[formcontrolname='occupation']");
	By radio_button=By.cssSelector("input[value='Male']");
	By check=By.cssSelector("input[type='checkbox']");
	By reg_button_last=By.cssSelector("input[value='Register']");
	By msg=By.xpath("//h1[contains(text(),'Account Created Successfully')]");
	
	
	public boolean fillRegistration() throws IOException
	{
		driver.click(register_button);
		driver.sendKeys(first_name, "Prasad");
		driver.sendKeys(last_name, "chm");
		driver.sendKeys(email, "mraghu@gmail.com");
		driver.sendKeys(mobile, "6363361684");
		driver.sendKeys(password, "Raghu@1143");
		driver.sendKeys(confirm_pwd, "Raghu@1143");
		
		//String content=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"//src//test//java//resources//data.json"));
		//ObjectMapper mapp= new ObjectMapper();
		//List<HashMap<String,String>> data=mapp.readValue(jsonContent, null);
		
		
		driver.selectDropDownByIndex(select_occ, 1);
		driver.click(radio_button);
		driver.click(check);
		driver.click(reg_button_last);
		driver.sleep(3000);
		return driver.isElementDisplayed(msg);
	}
	
}
