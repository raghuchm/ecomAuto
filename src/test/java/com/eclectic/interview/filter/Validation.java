package com.eclectic.interview.filter;

import browsers.BrowserInstance;
import pages.FilterPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testing.WebDriverTest;

import java.io.IOException;

public class Validation extends WebDriverTest {
    BrowserInstance driver;
    FilterPage filterPage;
    String exact_String_value="Man in the Middle";

    @BeforeClass
    public void testSpecific() throws IOException {
        driver=browser.get();
        filterPage =new FilterPage(driver);
        filterPage.launchApplication();
    }

    @Test
    public void search_exact_Values() throws InterruptedException {
        filterPage.enter_filter_data(exact_String_value);
        filterPage.assertSearchCount(1);
        filterPage.assertSearchText(exact_String_value);
        Thread.sleep(5000);

    }

    @Test
    public void search_pattern_Values() throws InterruptedException {

        filterPage.assertPattern_count("in", filterPage.getExpectedCountBasedOnPattern("in"));

    }


}
