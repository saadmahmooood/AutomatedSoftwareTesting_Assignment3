package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FreshPage_L1F21BSSE0452 {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"product-grid\"]/li[1]/div/div[1]/div/h3/a")
    public WebElement ginger;

    @FindBy(xpath = "//*[@id=\"ProductInfo-template--14216933965914__main\"]/div[4]/quantity-input/button[2]")
    public WebElement addBtn;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement inputFeild;

    @FindBy(xpath = "//*[@id=\"checkout-pay-button\"]")
    public WebElement payBtn;

    @FindBy(xpath = "//*[@id=\"product-form-template--14216933965914__main\"]/div/div/shopify-accelerated-checkout/shopify-buy-it-now-button/button")
    public WebElement buyBtn;


    public FreshPage_L1F21BSSE0452(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);// Initilize WebElement with Page Factory
    }
}
