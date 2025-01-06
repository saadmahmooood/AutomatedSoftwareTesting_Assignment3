package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BakeryPage_L1F21BSSE0492 {
    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Multigrain Bread']")
    public WebElement multigrain_bread;

    @FindBy(css = "button[name='plus']")
    public WebElement addBtn;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement inputFeild;

    @FindBy(css = "button[name='add']")
    public WebElement addToCart;

    @FindBy(xpath = "//button[@id='checkout-pay-button']")
    public WebElement payNowBtn;

    @FindBy(css= "button[class='shopify-payment-button__button shopify-payment-button__button--unbranded']")
    public WebElement buyBtn;


    public BakeryPage_L1F21BSSE0492(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
