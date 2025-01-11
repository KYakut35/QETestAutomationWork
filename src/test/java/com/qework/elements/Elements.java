package com.qework.elements;

import org.openqa.selenium.By;

public class Elements {

    public static By loginIcon = By.xpath("//img[contains(@class,'css')]");
    public static By loginUserName = By.xpath("//input[@placeholder='Username']");
    public static By loginPassword = By.xpath("//input[@placeholder='Password']");
    public static By loginButton = By.xpath("//div[contains(@class,'css-175oi2r r-1i6')]");
    public static By loginAlertMessage = By.xpath("//div[contains(@class,'css-175oi2r r-4')]");
    public static By homeInfoTab = By.xpath("//div[contains(@class,'css-175oi2r r-1i3')]");
    public static By homeLogoutButton = By.xpath("//div[contains(@class,'css-175oi2r r-1awozwy r-6')]");
    public static By homeOpenTransfer = By.xpath("//div[contains(@class,'css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r')]");
    public static By transferInfoTab = By.xpath("//div[contains(@class,'css-175oi2r r-1pi')]//div[contains(@class,'css-175oi2r r-1pi')]");
    public static By transferBackButton = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div");
    public static By transferTransferMoneyButton = By.xpath("(//div[contains(@class,'css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-17')])[1]");
    public static By transferAddMoneyButton = By.xpath("(//div[contains(@class,'css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-17')])[2]");
    public static By transferEditAccountButton = By.xpath("(//div[contains(@class,'css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-17')])[3]");
    public static By transferMoneyAmount = By.xpath("//input[contains(@class,'css-11')]");
    public static By transferMoneySendButton = By.xpath("//div[contains(@class,'css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13')]");
    public static By transferCompare = By.xpath("//div[@class='css-175oi2r']//div[1]//div[1]//div[1]//div[1]//div[4]//div[2]//div[1]");
    public static By transferEditAccount = By.xpath("//input[contains(@class,'css')]");
    public static By transferAccountName = By.cssSelector("div[class='css-175oi2r r-14lw9ot r-z2wwpe r-edyy15'] div:nth-child(1) div:nth-child(2)");
    public static By cardNumber = By.xpath("//div/div[2]/input");
    public static By cardHolder = By.xpath("//div/div[4]/input");
    public static By date = By.xpath("(//div/div[1]/input) [1]  ");
    public static By cvv = By.xpath("(//div/div[1]/input) [2]  ");
    public static By cardAmount = By.xpath("//div/div[8]/input");
    public static By cardSend = By.xpath("(//div/div[10])[2]");


}
