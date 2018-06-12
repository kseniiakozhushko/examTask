package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends GoogleBasePage{
    @FindBy(xpath = "//input[@id='lst-ib']")
    private WebElement inputField;

    @FindBy(xpath = "//div[@class='srg']/div")
    private List<WebElement> searchResultElements;

    @FindBy(xpath = "//a[@class='fl' and @aria-label='Page 2']")
    private WebElement secondSearchPage;

    public SearchResultsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public boolean isPageLoaded() {
        return inputField.isDisplayed();
    }

    public List<String> getSearchResults() {
        List<String> searchResultsList = new ArrayList();
        for (WebElement searchResultElement : searchResultElements) {
            String searchResultText = searchResultElement.getText();
            searchResultsList.add(searchResultText);
        }
        return searchResultsList;
    }

    public SecondSearchResultsPage switchToSecondSearchPage(){
        secondSearchPage.click();
        return new SecondSearchResultsPage(webDriver);
    }

}
