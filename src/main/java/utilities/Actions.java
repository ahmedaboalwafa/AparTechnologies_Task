package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Integer.parseInt;

public class Actions{

    WebDriver driver;
    private Wait wait;
    public Actions(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // this function created to call it when need to make a click on the button
    public void clickButton(By button) {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        driver.findElement(button).click();
    }

    // this function created to call it when need to get a text from any label
    public String getText(By label) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(label));
        return driver.findElement(label).getText();
    }

    }

