package com.qework.driver;

import com.qework.log.Log;
import com.qework.log.TestResultsLogger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultsLogger.class)
public class BaseTest  {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Log logger = new Log();

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        String baseURL = "https://www.vatanbilgisayar.com/";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-translate");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        logger.info("Driver initiated.");
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
        logger.info("\nTest Scenario Completed.");
    }

}