package testing;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class CucumbHooks extends WebDriverTest
{
    @Before
    public void BeforeClass() throws IOException {
        beforeClassTest("chrome");

    }

    @After
    public void AfterClass() throws IOException {
        tearClassTest();

    }



}
