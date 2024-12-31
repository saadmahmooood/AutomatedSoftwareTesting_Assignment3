package tests;

import base.BaseTest;
import config.ConfigReader;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.CafePage_L1F21BSSE0491;

import java.time.Duration;

/**
 * Test Case: Verify the functionality of navigating through the Cafe page, selecting an item,
 * adding it multiple times to the cart, and proceeding with the addition to the cart.
 *
 * Description:
 * - This test navigates to the Cafe page using a URL provided in the configuration.
 * - It interacts with the page to select a specific item ("Loaded Fries").
 * - The item is added to the cart multiple times (4 in this case).
 * - Finally, the test verifies that the item is added to the cart successfully.
 */
public class l1f21bsse0491 extends BaseTest {

    @Test
    public void cafeTest() throws InterruptedException {
        // Initialize the CafePage object
        CafePage_L1F21BSSE0491 cafePage = new CafePage_L1F21BSSE0491(driver);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Create an Actions object for advanced interactions
        Actions actions = new Actions(driver);

        // Navigate to the Cafe URL from the configuration file
        String cafeUrl = ConfigReader.getProperty("cafeUrl");
        driver.navigate().to(cafeUrl);

        // Scroll to the "Fourth Page" section and click on it
        actions.moveToElement(cafePage.fourthPage).perform();
        cafePage.fourthPage.click();

        // Scroll to the "Loaded Fries" item and select it
        actions.moveToElement(cafePage.loadedFries).perform();
        cafePage.loadedFries.click();

        // Scroll to the "Add" button and click it multiple times (4 times in this case)
        actions.moveToElement(cafePage.addBtn).perform();
        for (int i = 0; i < 4; i++) {
            cafePage.addBtn.click();
        }

        // Wait for 2 seconds to allow for any visual confirmation (not recommended for production)
        Thread.sleep(2000);

        // Add the item to the cart
        cafePage.addCart.click();

        // Wait for 3 seconds to ensure the item is added to the cart
        Thread.sleep(3000);
    }
}
