package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static utilities.Configuration_Data_Reader.getConfigData;

public class BaseTests {

    WebDriver driver;

    // this function to include all windows setting
    @BeforeClass
    public void setup(){
        if (getConfigData("Browser").equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (getConfigData("Browser").equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (getConfigData("Browser").equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.navigate().to(getConfigData("URL"));
        driver.manage().window().maximize();
    }

    // this function to make tear down for all opened windows
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
