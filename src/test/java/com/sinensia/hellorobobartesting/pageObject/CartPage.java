package com.sinensia.hellorobobartesting.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// http://localhost:3000/#!/
public class CartPage {

    @FindBy(css = "html > body > robo-robobar > div > div:nth-of-type(2) > robo-place-order > div:nth-of-type(2) > table > tbody > tr:nth-of-type(1) > td:nth-of-type(3) > div > div > div:nth-of-type(2) > button")
    public WebElement addColaButton;

    @FindBy(css = "html > body > robo-robobar > div > div:nth-of-type(2) > robo-place-order > div:nth-of-type(2) > table > tbody > tr:nth-of-type(2) > td:nth-of-type(3) > div > div > div:nth-of-type(2) > button")
    public WebElement addBeerButton;

    @FindBy(css = "html > body > robo-robobar > div > div:nth-of-type(2) > robo-place-order > div:nth-of-type(2) > table > tbody > tr:nth-of-type(3) > td:nth-of-type(3) > div > div > div:nth-of-type(2) > button")
    public WebElement addWineButton3;

    @FindBy(css = "th[class='ng-binding']")
    public WebElement totalField;

    @FindBy(css = ".btn-success")
    public WebElement checkoutButton;


    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}