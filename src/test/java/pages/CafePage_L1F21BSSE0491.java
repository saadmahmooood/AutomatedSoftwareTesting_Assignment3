package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CafePage_L1F21BSSE0491 {
WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ProductGridContainer\"]//li[4]/a")
    public WebElement fourthPage;

    @FindBy(xpath = "//*[@id=\"product-grid\"]/li[1]/div/div[1]/div/h3/a")
    public WebElement loadedFries;

    @FindBy(xpath = "//*[@id=\"ProductInfo-template--14216933965914__main\"]/div[4]/quantity-input/button[2]")
    public WebElement addBtn;

    @FindBy(xpath = "//*[@id=\"product-form-template--14216933965914__main\"]/div/button")
    public WebElement addCart;


    public CafePage_L1F21BSSE0491(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements using PageFactory
    }
}
