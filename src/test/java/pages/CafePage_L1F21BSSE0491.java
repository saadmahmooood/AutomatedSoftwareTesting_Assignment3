package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CafePage_L1F21BSSE0491 {
WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='4']")
    public WebElement fourthPage; //PageFactory ise ByFind to sore web elemnt instead of FindEDlement

    @FindBy(xpath = "//a[normalize-space()='Jalapeno Loaded Fries']")
    public WebElement loadedFries;

    @FindBy(xpath = "//button[@name='plus']")
    public WebElement addBtn;

    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    public WebElement addCart;


    public CafePage_L1F21BSSE0491(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements using PageFactory
    }
}
