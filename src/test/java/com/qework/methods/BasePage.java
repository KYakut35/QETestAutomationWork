package com.qework.methods;

import com.qework.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class BasePage extends BaseTest {

    protected final static Logger logger = Logger.getLogger(BasePage.class);

    protected static WebDriver driver;
    public BasePage() {
        driver = BaseTest.driver;
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Step("<locator> alanına kaydır")
    public void scrollWithAction(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(locator)).build().perform();
        logger.info("This element " + locator + " has been scrolled.");
    }

    public WebElement findElement(By locator) {
        logger.info(locator + " Element founded.");
        return driver.findElement(locator);

    }

    public WebElement findElement(WebElement locator) {
        logger.info(locator + " Element founded.");
        return locator;

    }

    public List<WebElement> findAllElements(By locator) {
        logger.info(locator + " Elements of this have been found.");
        return driver.findElements(locator);
    }
    @Step("<locator> elementine tıkla")
    public void click(By locator) {
        scrollWithAction(locator);
        js.executeScript("arguments[0].style.border='3px solid yellow'",findElement(locator));
        findElement(locator).click();
        logger.info("Clicked on this element " + locator + " .");
    }
    @Step("<text> textini <locator> elementine yaz")
    public void sendKeys(By locator , String text) {
        scrollWithAction(locator);
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
        logger.info(text + " has been written to this element " + locator + " .");

    }

    public boolean checkURL(String URL) {
        if (driver.getCurrentUrl().equals(URL)) {
            logger.info(URL + " website loaded successfully.");
            return true;

        }
        else {
            logger.error(URL + "website can not loaded.");
            return false;
        }
    }
    @Step("<locator> elementi sayfada var mı kontrol et")
    public boolean isDisplayed(By locator) {
        logger.info(locator + " Element located.");
        return findElement(locator).isDisplayed();
    }
    @Step("<seconds> saniye bekle")
    public void waitInSeconds(int seconds) throws InterruptedException {
        Thread.sleep(1000 * seconds);
    }
    @Step("<element> elementine js ile tıkla")
    public void clickWithJS(WebElement element){
        js.executeScript("arguments[0].click();",element);
    }

    @Step("<locator> elemetine beklemeli tıkla")
    public void clickWithFluentWait(By locator) {
        scrollWithAction(locator);

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        js.executeScript("arguments[0].style.border='3px solid yellow'", element);
        element.click();

        logger.info("Clicked on the element " + locator + ".");
    }

}
