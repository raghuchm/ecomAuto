package pages;

import browsers.BrowserInstance;
import org.openqa.selenium.By;
import org.testng.Assert;
import testing.PageObject;
import utils.PropertyfileData;

import java.io.IOException;

public class FilterPage extends PageObject {

    /**
     * Page class having util functions related to Filter tests
     */


    By filter_element=By.name("filter-input");
    By result_element=By.cssSelector(".table-row .data-name");

    public FilterPage(BrowserInstance driver){
        super(driver);
    }

    public void launchApplication() throws IOException {
        driver.loadURL(PropertyfileData.getPropertyFileData("url"));
    }

    public void verify_home_page_displayed(){
        System.out.println(driver.getTitle());
    }

    public void enter_filter_data(String val){
        driver.sendKeys(filter_element,val);
    }

    public void assertSearchCount(int expectedCount){
        Assert.assertEquals(driver.getElementCount(result_element),expectedCount);
    }

    public void assertSearchText(String expected_text){
        Assert.assertEquals( driver.getText(result_element),expected_text);

    }

    public long getExpectedCountBasedOnPattern(String pattern){
        driver.clearText(filter_element);
        driver.reload();
       return driver.getElementsCountWithMatchingText(result_element,pattern);
    }

    public void assertPattern_count(String pattern,long expectedCount){
        driver.clearText(filter_element);
        driver.sendKeys(filter_element,pattern);
        Assert.assertEquals(driver.getElementsCountWithMatchingText(result_element,pattern),expectedCount);
    }


    @Override
    public boolean waitForLoaded() {
        return false;
    }
}
