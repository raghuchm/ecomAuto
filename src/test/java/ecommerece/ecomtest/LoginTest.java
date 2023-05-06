package ecommerece.ecomtest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.gson.JsonParser;

import browsers.BrowserInstance;
import io.cucumber.core.internal.com.fasterxml.jackson.core.type.TypeReference;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import pages.LoginPage;
import testing.WebDriverTest;

public class LoginTest extends WebDriverTest
{
	
	BrowserInstance driver;
	LoginPage login_page;
	List<HashMap<String, String>> data;
	@BeforeClass
	public void initialize() throws Exception
	{
		driver=browser.get();
		login_page= new LoginPage(driver);
		login_page.launchApplication();	
		data=login_page.readJson();
		
	}
	@Test
	public void loginValidation() throws InterruptedException, IOException
	{
		String email=data.get(1).get("email");
		String pwd=data.get(1).get("password");
		boolean flag=login_page.login(email,pwd);
		Assert.assertTrue(flag);
	}
	
//	@Test
//	public void invalidPassword() throws InterruptedException, IOException
//	{
//	
//	boolean flag=login_page.login("veenavj.sauvg@gmail.com", "");
//	Assert.assertTrue(flag);
//	}
//	
//	@Test
//	public void invalidUname() throws InterruptedException, IOException
//	{
//	
//	boolean flag=login_page.login("", "Sauvg@1143");
//	Assert.assertTrue(flag);
//	}
//	@Test
//	public void invalidUnPaswrd() throws InterruptedException, IOException
//	{
//	
//	boolean flag=login_page.login("", "");
//	Assert.assertTrue(flag);
//	}
//	
	
}
