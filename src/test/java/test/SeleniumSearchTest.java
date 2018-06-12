package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleMainPage;
import page.SearchResultsPage;
import page.SecondSearchResultsPage;

import java.util.List;

public class SeleniumSearchTest extends SearchBaseTest{

    @Test
    public void seleniumSearchTest (){
        String searchTerm = "Selenium";

        Assert.assertTrue(googleMainPage.isPageLoaded(), "GoogleMainPage is not loaded");

        SearchResultsPage searchResultsPage = googleMainPage.search(searchTerm);
        Assert.assertTrue(searchResultsPage.isPageLoaded(), "SearchResultPage is not loaded");

        List<String> searchResultsList = searchResultsPage.getSearchResults();
        Assert.assertEquals(searchResultsList.size(),10, "Count of search result items is wrong.");

        SecondSearchResultsPage secondSearchResultsPage = searchResultsPage.switchToSecondSearchPage();
        Assert.assertTrue(secondSearchResultsPage.isPageLoaded(), "SearchResultsPage2 is not switched");

        List<String> searchResultsList2 = searchResultsPage.getSearchResults();
        Assert.assertEquals(searchResultsList2.size(),10, "Count of search result items is wrong.");





    }
}
