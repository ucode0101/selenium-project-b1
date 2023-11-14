package com.ucode_academy.test.day_13_actions_js_executor;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPageUpAndDown extends TestBase {

    @Test
    public void pageUpAndDown(){
        driver.get("https://www.amazon.com/");

        Actions actions = new Actions(driver);

        // Scroll the page down method chaining
        //actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        // Scroll the page all the way down to the end
        actions.sendKeys(Keys.END).perform();

        Waits.wait(3);

        // Scroll the page up
        actions.sendKeys(Keys.PAGE_UP).perform();

        Waits.wait(4);
    }
}
