package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductOnPage extends Utility {
    By usernameField1 = By.id("user-name");
    By passwordField1 = By.name("password");
    By loginButton1 = By.xpath("//input[@id='login-button']");
    By productDisplayPage = By.xpath("//span[contains(text(),'Products')]");
    By sixProductsLocator = By.className("inventory_item");

    public void usernameField1(String userName) {
        sendTextToElement(usernameField1, userName);
    }
    public void passwordField1(String password) {
        sendTextToElement(passwordField1, password);
    }

    public void clickOnLoginButton1() {
        clickOnElement(loginButton1);
    }

    public String ProductDisplayPage() {
        return getTextFromElement(productDisplayPage);
    }
    public int sixProducts() {
        List<WebElement> actualNumberElement = driver.findElements(sixProductsLocator);
        int actualNumber = actualNumberElement.size();
        return actualNumber;
    }


}
