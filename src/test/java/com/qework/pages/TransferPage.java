package com.qework.pages;

import com.qework.elements.Elements;
import com.qework.methods.BasePage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransferPage extends BasePage {

    public TransferPage() {
    }

    @Step("transferMoney elementine tıkla")
    public void transferMoneyClick() {
        scrollWithAction(Elements.transferTransferMoneyButton);
        findElement(Elements.transferTransferMoneyButton).click();
        logger.info("Clicked on this element " + Elements.transferTransferMoneyButton + " .");
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

    @Step("<text> textini transferMoneyAmount elementine yaz")
    public void transferMoneyAmount(String text) {
        scrollWithAction(Elements.transferMoneyAmount);
        findElement(Elements.transferMoneyAmount).click();
        findElement(Elements.transferMoneyAmount).clear();
        findElement(Elements.transferMoneyAmount).sendKeys(text);
        logger.info(text + " has been written to this element " + Elements.transferMoneyAmount + " .");

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

    @Step("<text> textini transferAccountName elementi ile karşılaştır")
    public void transferAccountNameCompare(String text) {
        WebElement element = findElement(Elements.transferAccountName);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        logger.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }



}
