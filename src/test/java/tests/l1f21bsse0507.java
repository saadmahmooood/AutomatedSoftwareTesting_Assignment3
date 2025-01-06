package tests;

import base.BaseTest;
import config.ConfigReader;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BakeryPage_L1F21BSSE0492;
import pages.PantryPage_L1F21BSSE0507;


public class l1f21bsse0507 extends BaseTest {
    @Test
    public void pantryTest() throws InterruptedException{

        // Initialize the BakeryPage object
        PantryPage_L1F21BSSE0507 pantry = new PantryPage_L1F21BSSE0507(driver);

        // maximizing the window for better view
        driver.manage().window().maximize();

        //Action object crated
        Actions actions = new Actions(driver);

        // Wait for few seconds
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

        // Navigate to the Bakery URL from the configuration file
        String pantryUrl = String.valueOf(ConfigReader.getProperty("pantryUrl"));
        driver.navigate().to(pantryUrl);

        // Scroll to the "banana Page" section and click on it
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));
        actions.moveToElement(pantry.stawberryJam).perform();
        pantry.stawberryJam.click();


        actions.moveToElement(pantry.addBtn).perform();
        for (int i = 0; i < 3; i++) {
            pantry.addBtn.click();
        }

        // Wait for 3 seconds
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

        // Buy the item to the cart
        pantry.buyBtn.click();

        // Enter value into the email feilds
        actions.moveToElement(pantry.inputFeild).sendKeys("hamzarazahussaim@gmail.com").perform();

        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

    }
}
