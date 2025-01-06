package tests;

import base.BaseTest;
import config.ConfigReader;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BakeryPage_L1F21BSSE0492;
import pages.FrozenPage_L1F21BSSE0395;


public class l1f21bsse0492 extends BaseTest {
    @Test
    public void bakeryTest() throws InterruptedException{

        // Initialize the BakeryPage object
        BakeryPage_L1F21BSSE0492 bakery = new BakeryPage_L1F21BSSE0492(driver);

        // maximizing the window for better view
        driver.manage().window().maximize();

        //Action object crated
        Actions actions = new Actions(driver);

        // Wait for few seconds
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

        // Navigate to the Bakery URL from the configuration file
        String bakeryUrl = String.valueOf(ConfigReader.getProperty("bakeryUrl"));
        driver.navigate().to(bakeryUrl);

        // Scroll to the "banana Page" section and click on it
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));
        actions.moveToElement(bakery.multigrain_bread).perform();
        bakery.multigrain_bread.click();


        actions.moveToElement(bakery.addBtn).perform();
        for (int i = 0; i < 3; i++) {
            bakery.addBtn.click();
        }

        // Wait for 3 seconds
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

        // Buy the item to the cart
        bakery.buyBtn.click();

        // Enter value into the email feilds
        actions.moveToElement(bakery.inputFeild).sendKeys("samiullah@gmail.com").perform();

        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

    }
}
