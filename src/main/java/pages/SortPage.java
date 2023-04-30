package pages;

import browsers.BrowserInstance;
import org.openqa.selenium.By;
import testing.PageObject;

import java.util.*;
import java.util.stream.Collectors;

public class SortPage extends PageObject {
    /**
     * Page class having util functions related to Sort tests
     */


    public SortPage(BrowserInstance driver){
        super(driver);
    }
    By name_result_element=By.cssSelector(".table-row .data-name");
    By comp_result_element=By.cssSelector(".table-row .data-complexity");
    By selectElement=By.id("sort-select");


    @Override
    public boolean waitForLoaded() {
        return false;
    }

    public boolean assertOrder(String colName) throws InterruptedException {
        boolean result=false;
        if(colName.equalsIgnoreCase("name")) {
            List<String> actual = driver.getResultText(name_result_element);
            driver.SelectDropDown(selectElement,colName.toLowerCase());
            List<String> expected = driver.getResultText(name_result_element);
            Collections.sort(actual);
             result=actual.toString().contentEquals(expected.toString())?true:false;
        }
        if(colName.equalsIgnoreCase("complexity")) {
            List<String> expected = driver.getResultText(comp_result_element);
            driver.SelectDropDown(selectElement,colName.toLowerCase());
            List<String> actual = driver.getResultText(comp_result_element);
            expected=sortComplexity(expected);
            result=actual.toString().contentEquals(expected.toString())?true:false;
        }
        return result;

    }

    public List<String> sortComplexity(List<String> actual){
        /*
        We can use comparator instead of custom logic
         */
       String[] definedorder = {"low","medium","high"};
       List<String> uniqueList =Arrays.asList(definedorder);
       List<String> sortedlist=new ArrayList<>();
        int count=0;
        for (int i=0;i<uniqueList.size();i++) {
            for (int j=0;j<actual.size();j++){
                if (uniqueList.get(i).equalsIgnoreCase(actual.get(j))){
                    sortedlist.add(count,actual.get(j));
                    count++;
                }
            }


        }
        return sortedlist;

    }
}
