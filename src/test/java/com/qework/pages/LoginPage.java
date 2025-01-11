package com.qework.pages;

import com.qework.elements.Elements;
import com.qework.methods.BasePage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;


public class LoginPage extends BasePage {

    public LoginPage() {
    }

    @Step("loginIcon elementi sayfada var mı kontrol et")
    public boolean loginIconIsDisplayed() {
        logger.info(Elements.loginIcon + " Element located.");
        return findElement(Elements.loginIcon).isDisplayed();
    }

    @Step("loginAlertMessage elementi sayfada var mı kontrol et")
    public boolean loginAlertIsDisplayed() {
        logger.info(Elements.loginAlertMessage + " Element located.");
        return findElement(Elements.loginAlertMessage).isDisplayed();
    }


    @Step("<text> textini loginUserName elementine yaz")
    public void loginUsername(String text) {
        scrollWithAction(Elements.loginUserName);
        findElement(Elements.loginUserName).clear();
        findElement(Elements.loginUserName).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.loginUserName + " .");

    }
    @Step("<text> textini loginPassword elementine yaz")
    public void loginPassword(String text) {
        scrollWithAction(Elements.loginPassword);
        findElement(Elements.loginPassword).clear();
        findElement(Elements.loginPassword).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.loginUserName + " .");

    }

    @Step("loginButton elementine tıkla")
    public void click() {
        scrollWithAction(Elements.loginButton);
        findElement(Elements.loginButton).click();
        logger.info("Clicked on this element " + Elements.loginButton + " .");
    }


}
