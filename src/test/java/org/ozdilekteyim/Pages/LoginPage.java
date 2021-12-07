package org.ozdilekteyim.Pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.ozdilekteyim.Base.BasePage;

public class LoginPage extends BasePage {

    @Step("enter email to email textbox")
    public void emailStep()
    {
        appiumDriver.findElement(By.id("75f81295-05cb-4b5f-a123-acdc7a3ecd00")).sendKeys("text");
    }

    @Step("enter password to password textbox")
    public void passStep()
    {
        appiumDriver.findElement(By.id("d7a40550-0170-49b3-83f6-3c38c2a663c0")).sendKeys("text");
    }

    @Step("tap back button two times")
    public void goBackStep() throws InterruptedException {
        int j = 0;
        while (j < 2)
        {
            appiumDriver.findElement(By.id("69a15241-42fa-499c-b22e-faaeb3e4620d")).click();
            j++;
            Thread.sleep(2000);
        }
    }
}
