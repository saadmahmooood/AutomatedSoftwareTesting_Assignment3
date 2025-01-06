package tests;

import base.BaseTest;
import config.ConfigReader;
import org.checkerframework.checker.units.qual.Acceleration;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.FrozenPage_L1F21BSSE0395;

import javax.swing.*;

/*
 * Test Case: FrozenTest
 *
 * This test checks the Frozen page functionality:
 * 1. Maximizes the browser window.
 * 2. Navigates to the Frozen page URL.
 * 3. Clicks the "Blueberry" section.
 * 4. Adds the item to the cart 6 times.
 * 5. Completes the purchase by:
 *    - Entering an email.
 *    - Clicking the "Pay" button.
 */



public class l1f21bsse0395 extends BaseTest{
    @Test
    public void FrozenTest() throws InterruptedException{

        // Initialize the FrozenPage object
        FrozenPage_L1F21BSSE0395 frozen = new FrozenPage_L1F21BSSE0395(driver);

        // Maximize the browser window
        driver.manage().window().maximize();

        //Create an action object to interact or send things from mouse or keyboard
        Actions actions = new Actions(driver);

        // Wait for 2 seconds to allow for any visual confirmation
        Thread.sleep(Long.parseLong(ConfigReader.getProperty("wait_time")));

        // Navigate to the Frozen URL from the configuration file
        String FrozenUrl = ConfigReader.getProperty("frozenUrl");
        driver.navigate().to(FrozenUrl);

        // Scroll to the "blueberry Page" section and click on it
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
        actions.moveToElement(frozen.inputFeild).sendKeys("maaliyanumar@gmail.com").perform();
        // Hit pay button to pay frozen ice
        frozen.payBtn.click();

    }
}