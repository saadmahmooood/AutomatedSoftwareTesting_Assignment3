package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FreshPage_L1F21BSSE0452 {
    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Ginger']")
    public WebElement ginger;

    @FindBy(xpath = "//button[@name='plus']")
    public WebElement addBtn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement inputFeild;

    @FindBy(xpath = "//button[normalize-space()='Buy it now']")
    public WebElement buyBtn;


    public FreshPage_L1F21BSSE0452(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);// Initilize WebElement with Page Factory
    }
}
