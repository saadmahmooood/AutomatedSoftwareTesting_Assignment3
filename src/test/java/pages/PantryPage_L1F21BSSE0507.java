package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantryPage_L1F21BSSE0507 {
    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Strawberry Jam']")
    public WebElement stawberryJam;

    @FindBy(css = "button[name='plus']")
    public WebElement addBtn;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement inputFeild;

    @FindBy(css = "button[name='add']")
    public WebElement addCart;

    @FindBy(xpath = "//button[@id='checkout-pay-button']")
    public WebElement payBtn;

    @FindBy(xpath= "//button[normalize-space()='Buy it now']")
    public WebElement buyBtn;


    public PantryPage_L1F21BSSE0507(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
