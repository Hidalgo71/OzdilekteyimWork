package org.ozdilekteyim.Pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.ozdilekteyim.Base.BasePage;

import java.util.List;
import java.util.Random;

public class AddBasketPage extends BasePage {

    @Step("add random item to basket")
    public void addBasketPage()
    {
        List<MobileElement> elements = appiumDriver.findElements(By.id(""));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
    }
}
