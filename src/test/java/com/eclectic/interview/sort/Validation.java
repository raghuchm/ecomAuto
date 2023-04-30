package com.eclectic.interview.sort;

import browsers.BrowserInstance;
import pages.FilterPage;
import pages.SortPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testing.WebDriverTest;

import java.io.IOException;

public class Validation extends WebDriverTest {
    BrowserInstance driver;
    FilterPage filterPage;
    SortPage sortPage;
    String exact_String_value="Man in the Middle";

    @BeforeClass
    public void testSpecific() throws IOException {
        driver=browser.get();
        filterPage=new FilterPage(driver);
        sortPage=new SortPage(driver);
        filterPage.launchApplication();
    }

    @Test
    public void assertNameSort() throws InterruptedException {

        Assert.assertTrue(sortPage.assertOrder("name"));
    }

    @Test
    public void assertComplexitySort() throws InterruptedException {

        Assert.assertTrue(sortPage.assertOrder("Complexity"));
    }


}
