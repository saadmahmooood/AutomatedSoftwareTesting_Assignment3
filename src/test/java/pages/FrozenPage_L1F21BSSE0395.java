package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class FrozenPage_L1F21BSSE0395 {
    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Blueberry Frozen 300 Gm']")
    public WebElement blueberry;

    @FindBy(xpath = "//button[@name='plus']")
    public WebElement addBtn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement inputFeild;

    @FindBy(xpath = "//button[@id='checkout-pay-button']")
    public WebElement payBtn;

    @FindBy(xpath = "//button[normalize-space()='Buy it now']")
    public WebElement buyBtn;


    public FrozenPage_L1F21BSSE0395(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);// Initilize WebElement with Page Factory
    }
}
