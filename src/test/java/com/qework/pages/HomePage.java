package com.qework.pages;

import com.qework.elements.Elements;
import com.qework.methods.BasePage;
import com.thoughtworks.gauge.Step;

public class HomePage extends BasePage {

    public HomePage() {
    }

    @Step("homeInfoTab elementi sayfada var mı kontrol et")
    public boolean homeInfoTabIsDisplayed() {
        logger.info(Elements.homeInfoTab + " Element located.");
        return findElement(Elements.homeInfoTab).isDisplayed();
    }

    @Step("homeLogoutButton elementine tıkla")
    public void homeLogoutButtonClick() {
        scrollWithAction(Elements.homeLogoutButton);
        findElement(Elements.homeLogoutButton).click();
        logger.info("Clicked on this element " + Elements.homeLogoutButton + " .");
    }
    @Step("homeOpenTransfer elementine tıkla")
    public void homeOpenTransferClick() {
        scrollWithAction(Elements.homeOpenTransfer);
        findElement(Elements.homeOpenTransfer).click();
        logger.info("Clicked on this element " + Elements.homeOpenTransfer + " .");
    }

}
