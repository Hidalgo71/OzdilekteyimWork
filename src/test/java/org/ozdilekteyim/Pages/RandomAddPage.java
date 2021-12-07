package org.ozdilekteyim.Pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.ozdilekteyim.Base.BasePage;

import java.util.List;
import java.util.Random;

public class RandomAddPage extends BasePage {

    @Step("add random item")
    public void randomAddSpec()
    {
        List<MobileElement> elements = appiumDriver.findElements(By.id(""));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();

        appiumDriver.findElement(By.id("aa1121c6-df32-4a0a-b0af-8a3e6b65f7ca")).click();
    }
}
