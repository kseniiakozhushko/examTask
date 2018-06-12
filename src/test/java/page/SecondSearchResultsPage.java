package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondSearchResultsPage extends GoogleBasePage{

    @FindBy(xpath = "//td[@class='cur']")
    private WebElement secondPageNumber;


    public SecondSearchResultsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public boolean isPageLoaded() {
        return secondPageNumber.isDisplayed();
    }
}
