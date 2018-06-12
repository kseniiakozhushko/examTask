package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage extends GoogleBasePage{

    @FindBy(id = "lst-ib")
    private WebElement searchField;

    @FindBy(xpath = "//input[@type='submit' and contains(@value , 'Google')]")
    private WebElement searchButton;

    public GoogleMainPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public boolean isPageLoaded() {
        return searchButton.isDisplayed();
    }

    public SearchResultsPage search(String searchTerm){
        searchField.sendKeys(searchTerm);
        searchField.sendKeys(Keys.RETURN);
        return new SearchResultsPage(webDriver);
    }
}
