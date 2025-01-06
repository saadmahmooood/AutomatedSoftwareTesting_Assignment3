package tests;

import base.BaseTest;
import config.ConfigReader;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.FrozenPage_L1F21BSSE0395;

/*
 * Test Case: FrozenTest
 *
 * This test checks the Frozen page functionality:
 * 1. Maximizes the browser window.
 * 2. Navigates to the Fresh page URL.
 * 3. Clicks the "Ginger" section.
 * 4. Adds the item to the cart 5 times.
 * 5. Completes the purchase by:
 *    - Entering my email.
 */


public class l1f21bsse0452 extends BaseTest{
    @Test
    public void freshTest() throws InterruptedException{

        // Initialize the FrozenPage object
        FrozenPage_L1F21BSSE0395 frozen = new FrozenPage_L1F21BSSE0395(driver);

        // Maximize the browser window
        driver.manage().window().maximize();

        //Create an action object to interact or send things from mouse or keyboard
        Actions actions = new Actions(driver);

        // Wait for 2 seconds to allow for any visual confirmation
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

        // Navigate to the Frozen URL from the configuration file
        String freshUrl = String.valueOf(ConfigReader.getProperty("freshUrl"));
        driver.navigate().to(freshUrl);

        // Scroll to the "banana Page" section and click on it
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));
        actions.moveToElement(frozen.blueberry).perform();
        frozen.blueberry.click();

        // Scroll to the "Add" button and click it multiple times (6 times in this case)
        actions.moveToElement(frozen.addBtn).perform();
        for (int i = 0; i < Integer.parseInt(ConfigReader.getProperty("loop")); i++) {
            frozen.addBtn.click();
        }

        // Wait for 3 seconds to allow for any visual confirmation
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

        // Buy the item to the cart
        frozen.buyBtn.click();

        // Enter value into the email feilds
        actions.moveToElement(frozen.inputFeild).sendKeys("kamransajjad@gmail.com").perform();

        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

    }
}