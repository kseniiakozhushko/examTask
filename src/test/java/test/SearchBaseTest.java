package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import page.GoogleMainPage;

public class SearchBaseTest {
    WebDriver webDriver;
    GoogleMainPage googleMainPage;

    @Parameters({"browserType"})
    @BeforeMethod
    public void beforeTest(@Optional("chrome") String browserType) {
        /*if ("firefox".equals(browserType.toLowerCase())) {
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();

        } else if ("chrome".equals(browserType.toLowerCase())) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();

        }

        webDriver.navigate().to("https://www.google.com/");
        googleMainPage = new GoogleMainPage(webDriver);

    }*/
        switch (browserType.toLowerCase()){
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            default :
                WebDriverManager.iedriver().setup();
                webDriver = new InternetExplorerDriver();
        }
        webDriver.navigate().to("https://www.google.com/");
        googleMainPage = new GoogleMainPage(webDriver);
    }

    @AfterMethod
    public void after() {
        webDriver.close();
    }
}
