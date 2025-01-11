package com.qework.pages;

import com.qework.elements.Elements;
import com.qework.methods.BasePage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransferPage extends BasePage {

    public TransferPage() {
    }

    @Step("transferInfoTab elementi sayfada var mı kontrol et")
    public boolean transferInfoTabIsDisplayed() {
        logger.info(Elements.transferInfoTab + " Element located.");
        return findElement(Elements.transferInfoTab).isDisplayed();
    }

    @Step("transferMoney elementine tıkla")
    public void transferMoneyClick() {
        scrollWithAction(Elements.transferTransferMoneyButton);
        findElement(Elements.transferTransferMoneyButton).click();
        logger.info("Clicked on this element " + Elements.transferTransferMoneyButton + " .");
    }

    @Step("cardSend elementine tıkla")
    public void cardSendClick() {
        scrollWithAction(Elements.cardSend);
        findElement(Elements.cardSend).click();
        logger.info("Clicked on this element " + Elements.cardSend + " .");
    }

    @Step("addMoney elementine tıkla")
    public void addMoneyClick() {
        scrollWithAction(Elements.transferAddMoneyButton);
        findElement(Elements.transferAddMoneyButton).click();
        logger.info("Clicked on this element " + Elements.transferAddMoneyButton + " .");
    }

    @Step("transferEditAccountButton elementine tıkla")
    public void transferEditClick() {
        scrollWithAction(Elements.transferEditAccountButton);
        findElement(Elements.transferEditAccountButton).click();
        logger.info("Clicked on this element " + Elements.transferEditAccountButton + " .");
    }

    @Step("transferMoneySendButton elementine tıkla")
    public void transferMoneySendClick() {
        scrollWithAction(Elements.transferMoneySendButton);
        findElement(Elements.transferMoneySendButton).click();
        logger.info("Clicked on this element " + Elements.transferMoneySendButton + " .");
    }

    @Step("transferBackButton elementine tıkla")
    public void transferBackButtonSendClick() {
        scrollWithAction(Elements.transferBackButton);
        findElement(Elements.transferBackButton).click();
        logger.info("Clicked on this element " + Elements.transferBackButton + " .");
    }

    @Step("<text> textini transferMoneyAmount elementine yaz")
    public void transferMoneyAmount(String text) {
        scrollWithAction(Elements.transferMoneyAmount);
        findElement(Elements.transferMoneyAmount).click();
        findElement(Elements.transferMoneyAmount).clear();
        findElement(Elements.transferMoneyAmount).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.transferMoneyAmount + " .");

    }

    @Step("<text> textini cardNumber elementine yaz")
    public void cardNumber(String text) {
        scrollWithAction(Elements.cardNumber);
        findElement(Elements.cardNumber).click();
        findElement(Elements.cardNumber).clear();
        findElement(Elements.cardNumber).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.cardNumber + " .");

    }

    @Step("<text> textini cardHolder elementine yaz")
    public void cardHolder(String text) {
        scrollWithAction(Elements.cardHolder);
        findElement(Elements.cardHolder).click();
        findElement(Elements.cardHolder).clear();
        findElement(Elements.cardHolder).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.cardHolder + " .");
    }

    @Step("<text> textini cardDate elementine yaz")
    public void cardDate(String text) {
        scrollWithAction(Elements.date);
        findElement(Elements.date).click();
        findElement(Elements.date).clear();
        findElement(Elements.date).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.date + " .");
    }

    @Step("<text> textini cardAmount elementine yaz")
    public void cardAmount(String text) {
        scrollWithAction(Elements.cardAmount);
        findElement(Elements.cardAmount).click();
        findElement(Elements.cardAmount).clear();
        findElement(Elements.cardAmount).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.cardAmount + " .");
    }

    @Step("<text> textini cardCVV elementine yaz")
    public void cardCVV(String text) {
        scrollWithAction(Elements.cvv);
        findElement(Elements.cvv).click();
        findElement(Elements.cvv).clear();
        findElement(Elements.cvv).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.cvv + " .");
    }


    @Step("<text> textini transferEditAccount elementine yaz")
    public void transferEditAccount(String text) {
        scrollWithAction(Elements.transferEditAccount);
        findElement(Elements.transferEditAccount).click();
        findElement(Elements.transferEditAccount).clear();
        findElement(Elements.transferEditAccount).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.transferEditAccount + " .");

    }

    @Step("<text> textini transferMoneyAmount elementi ile karşılaştır")
    public void transferMoneyCompare(String text) {
        WebElement element = findElement(Elements.transferCompare);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        logger.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }

    public void addMoneyCompare(String text) {
        WebElement element = findElement(Elements.transferCompare);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        logger.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }

    @Step("<text> textini transferAccountName elementi ile karşılaştır")
    public void transferAccountNameCompare(String text) {
        WebElement element = findElement(Elements.transferAccountName);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        logger.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }



}
